package application;

import java.io.*;
import java.util.*;
import org.json.*;

import Communication.Arena;
import communication.ComGUI;
import ordre.Ordre;
import ordre.OrdreManager;
import ordre.Production;
import produit.Node;
import produit.Parser;
import produit.Produit;
import produit.ProduitManager;
import produit.Service;
import produit.ServiceManager;
import ressource.Ressource;
import ressource.RessourceManager;

public class InitialisationSysteme {
	
	private static Arena comArena; //initialiser la communication avec arena
	
	//une methode pour lire le fichier json qui represent un scenario défini dans l'ihm
    public static String readFileJSON(String file) {

		String chaine = "";
		// lecture du fichier texte
		try {
			InputStream ips = new FileInputStream(file);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null)
				chaine += ligne + "\n";
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	  return chaine;
	}

    /*Initialiser les services a realiser pour chauque produit :
     * Intégrer les services définies dans l'ihm au services manager
     * (le service manager permet de définir les services réalisable au sein de l'atelier)
     */
	public static ServiceManager initialiserServices(JSONObject obj) throws JSONException{

		ServiceManager sm = new ServiceManager();

		//Récupérer l'ensemble des services dans le fichier JSON
		JSONArray services = obj.getJSONArray("services");

		/*
		 * Pour chaque services récupéré créer un Object Java qui lui correspond et ajouter cet objet 
	     * a la liste des services du services manager.
		*/
	
		for (int i = 0; i < services.length(); ++i) {
			JSONObject service = (JSONObject) services.get(i);
			sm.addService(new Service(service.getInt("id"), service.getString("name")));
		}
		return sm;
	}
   
	/*une fois le services manager initialisé, il est utilisé dans la prochaine étape
	 * d'initialisation du système : RessourceManager.
	 */
	
	/*Pour le ressource manager il a besoin de deux paramètre :
	 *   1-OBJ "le fichier JSON envoyer par l'IHM " : pour initialiser la position de la ressource
	 *   2-SM  : Service Manager
	 */
	
	public static RessourceManager initialiserRessources(JSONObject obj, ServiceManager sm) throws JSONException {

		RessourceManager rm = new RessourceManager();
		
		//le resource manager va savoir la version objet du layout de l'atelier.
		Parser layout = new Parser();
		layout.parse(obj.getJSONObject("layoutSpec"));
		rm.setLayout(layout);
 
		//le RM aura connaisance des resources disponibles.
		JSONArray ressources = obj.getJSONArray("ressources");

		
		/*Pour chaque ressource, attribuer les services qu'elle sera capable de realiser
		tel que le scénario l’aura décrit
		*/
		for (int i = 0; i < ressources.length(); ++i) {
			
			JSONObject ressource = (JSONObject) ressources.get(i);

			for (int j = 0; j < ressource.getInt("nb"); ++j) {
				Map<Service, Integer> listServices = new HashMap<Service, Integer>();
				JSONArray services = ressource.getJSONArray("services");
				for (int k = 0; k < services.length(); ++k) {
					JSONObject serviceAtIndex = (JSONObject) services.get(k);
					//Parcourir la liste des services existants dans le services manager
					for (Service service : sm.getServicesList()) {
						//Verifier si ce service est attribué a une ressource
						if (service.getId() == serviceAtIndex.getInt("id")) {
							listServices.put(service, serviceAtIndex.getInt("duration"));
							break;
						}
					}
				}
				//creer une nouvelle resource et l'ajouter au resource manager.
				rm.addRessource(ressource.getInt("id"), ressource.getString("name"), listServices);
			}
		}
		
		// Initialisation de la position des ressources
		JSONArray nodes = obj.getJSONObject("layoutSpec").getJSONArray("nodes");

		for (int k = 0 ; k < nodes.length() ; ++k) {
			//pour chaque noeud.
			JSONObject node = (JSONObject) nodes.get(k);
			//pour chauque ressource dans le resource manager
			for(Ressource ressourceItem : rm.getListRessource()) {
				try {
					//si la resource est assigné a un noeud
					if(node.getInt("ressource") == ressourceItem.getId())
						//affecter les noeuds au ressources
						ressourceItem.setNode(new Node(node.getInt("id"), node.getString("name"), "ressource"));
				}catch (NullPointerException | JSONException e) { }
			}
		}
		return rm;
	}

	//Initialisation des produits
	public static ProduitManager initialiserProducts(JSONObject obj) throws JSONException {

		ProduitManager pm = new ProduitManager();

		JSONArray produits = obj.getJSONArray("products");

		for (int i = 0; i < produits.length(); ++i) {
			JSONObject produit = (JSONObject) produits.get(i);
			//creer un objet java produit pour chaque produit dans le fichier JSON
			Produit p = new Produit(produit.getInt("id"), produit.getString("description"));

			//maintenant pour chaque produit initialiser les services qu'il peut realiser.
			JSONArray allServices = produit.getJSONArray("services");

			for (int j = 0; j < allServices.length(); ++j) {
				List<Integer> serviceList = new ArrayList<Integer>();
				JSONArray subArray = (JSONArray) allServices.get(j);
				for (int k = 0; k < subArray.length(); ++k)
					serviceList.add((int) subArray.get(k));
				    p.addServicesList(serviceList);
			}
			//ajouter le produit au product manager
			pm.addProduit(p);
		}
		return pm;
	}

	/*
	 * Initilisation des ordres
	 *     @param obj: le fichier contenant le scenario
	 *     @param pm : il contient l'ensemble des produit ainsi que les services nécéssaires pour sa realisation
	 */
	
	public static OrdreManager initialiserOrdres(JSONObject obj, ProduitManager pm) throws JSONException {
	
		OrdreManager om = new OrdreManager();
		JSONArray ordres = obj.getJSONArray("orders");
		for (int i = 0; i < ordres.length(); ++i) {
			JSONObject ordreAtIndex = (JSONObject) ordres.get(i);
			Ordre ordre = new Ordre(ordreAtIndex.getInt("id"));
			JSONArray produits = ordreAtIndex.getJSONArray("products");
			for(int j = 0 ; j < produits.length() ; ++j) {
				JSONObject produitAtIndex = (JSONObject) produits.get(j);
				ordre.addProduit(new Production(produitAtIndex.getInt("id"), produitAtIndex.getInt("nb")));
				pm.addProduction(produitAtIndex.getInt("id"), produitAtIndex.getInt("nb"), 10);
			}
			om.addOrdre(ordre);
		}
		return om;
	}
	
	public static void initialiserSysteme(String fileContent) {
		
		if (fileContent != "") {
			try {
				
				JSONObject obj  = new JSONObject(fileContent);
				System.out.print("Initialisation services : ");
				ServiceManager sm = initialiserServices(obj);
				System.out.println("finie");
				System.out.print("Initialisation ressources : ");
				RessourceManager rm = initialiserRessources(obj, sm);
				System.out.println("finie");
				System.out.print("Initialisation produits : ");
				ProduitManager pm = initialiserProducts(obj);
				System.out.println("finie");
				System.out.print("Initialisation ordres : ");
				OrdreManager om = initialiserOrdres(obj, pm);
				System.out.println("finie");

				System.out.print("Initialisation annuaire de service : ");
				sm.initialiserAnnuaire(rm);
				System.out.println("finie");

				System.out.println("Nombre d'ordres : " + om.getOrdersList().size());
				System.out.println("Nombre de ressources : " + rm.getListRessource().size());
				System.out.println("Nombre de produit : " + pm.getProductsList().size());
				System.out.println("Nombre de Noeuds : " + rm.getLayout().getListeNoeuds().size());

				// L'initialisation donne la main Ã  l'OrdreManager
				om.launchOrders(pm, sm, rm, comArena);
				
			} catch (JSONException e) {
				System.out.println("Format du fichier JSON invalide");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		//String fileContent = readFileJSON("ps1.json");
		ComGUI servSocket;
		
		try {
			// Arena
			comArena = new Arena(5004, "127.0.0.1");
			// Serveur socket IHM
			servSocket = new ComGUI();
			servSocket.start();	
			
			//Initilise the system without communication with a real GUI
			//initialiserSysteme(fileContent);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
