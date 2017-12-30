package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import communication.ComArena;
import communication.ListenerArena;
import communication.ServeurSocket;
import ordre.Ordre;
import ordre.OrdreManager;
import produit.Node;
import produit.Parser;
import produit.Produit;
import produit.ProduitManager;
import produit.Service;
import produit.ServiceManager;
import ressource.Ressource;
import ressource.RessourceManager;

public class InitialisationSysteme {
	
	// Informations de connexion pour le socket Arena
	private final static int port = 1202;
	private final static String arenaAddresse = "127.0.0.1";	
	private static Socket socketArena;

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

	public static ServiceManager initialiserServices(JSONObject obj) throws JSONException {

		ServiceManager sm = new ServiceManager();

		JSONArray services = obj.getJSONArray("services");

		for (int i = 0; i < services.length(); ++i) {
			JSONObject service = (JSONObject) services.get(i);

			sm.addService(new Service(service.getInt("id"), service.getString("name"), service.getInt("duration"),
					service.getString("path")));
		}

		return sm;
	}

	public static RessourceManager initialiserRessources(JSONObject obj, ServiceManager sm) throws JSONException {

		RessourceManager rm = new RessourceManager();
		
		Parser layout = new Parser();
		layout.parse(obj.getJSONObject("layoutSpec"));
		rm.setLayout(layout);

		JSONArray ressources = obj.getJSONArray("ressources");

		for (int i = 0; i < ressources.length(); ++i) {
			JSONObject ressource = (JSONObject) ressources.get(i);

			for (int j = 0; j < ressource.getInt("nb"); ++j) {
				List<Service> listServices = new ArrayList<Service>();
				JSONArray services = ressource.getJSONArray("services");
				for (int k = 0; k < services.length(); ++k) {
					for (Service service : sm.getServicesList()) {
						if (service.getId() == services.getInt(k)) {
							listServices.add(service);
							break;
						}
					}

				}
				rm.addRessource(ressource.getInt("id"), listServices);
			}
			
			
		}
		
		// Initialisation de la position des ressources
		JSONArray nodes = obj.getJSONObject("layoutSpec").getJSONArray("nodes");

		for (int k = 0 ; k < nodes.length() ; ++k) {
			JSONObject node = (JSONObject) nodes.get(k);
			for(Ressource ressourceItem : rm.getListRessource()) {
				try {
					if(node.getInt("ressource") == ressourceItem.getId())
						ressourceItem.setNode(new Node(node.getInt("id"), "ressource"));

				}catch (NullPointerException | JSONException e) { }

			}
				
		}
		return rm;
	}

	public static ProduitManager initialiserProducts(JSONObject obj) throws JSONException {

		ProduitManager pm = new ProduitManager();

		JSONArray produits = obj.getJSONArray("products");

		for (int i = 0; i < produits.length(); ++i) {
			JSONObject produit = (JSONObject) produits.get(i);
			Produit p = new Produit(produit.getInt("id"), produit.getString("description"));

			JSONArray allServices = produit.getJSONArray("services");

			for (int j = 0; j < allServices.length(); ++j) {
				List<Integer> serviceList = new ArrayList<Integer>();
				JSONArray subArray = (JSONArray) allServices.get(j);

				for (int k = 0; k < subArray.length(); ++k)
					serviceList.add((int) subArray.get(k));
				
				p.addServicesList(serviceList);
			}

			pm.addProduit(p);
		}

		return pm;
	}

	public static OrdreManager initialiserOrdres(JSONObject obj, ProduitManager pm) throws JSONException {

		OrdreManager om = new OrdreManager();
		JSONArray produits = obj.getJSONArray("orders");

		for (int i = 0; i < produits.length(); ++i) {
			JSONObject produit = (JSONObject) produits.get(i);

			om.addOrdre(new Ordre(produit.getInt("id"), produit.getInt("id")));
			pm.addProduction(produit.getInt("id"), produit.getInt("id"), 10);
		}

		return om;
	}
	
	public static void initialiserSysteme(String fileContent) {
		
		//String fileContent = readFileJSON(message);
		
		if (fileContent != "") {
			// System.out.println(fileContent);
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

//				System.out.println("Annuaire");
//				sm.printAnnuaire();
				
				
				System.out.println("Nombre d'ordres : " + om.getOrdersList().size());
				System.out.println("Nombre de ressources : " + rm.getListRessource().size());
				System.out.println("Nombre de Noeuds : " + rm.getLayout().getListeNoeuds().size());

				for(Ordre ordre : om.getOrdersList()) {
					List<List<Integer>> nextServicesId = pm.getNextService(ordre.getId());
					List<List<Service>> nextServicesString = sm.transformServicesIdToString(nextServicesId);
					Node previousNode = null;
					
					// Pour chaque service à effectuer, récupère les ressources pouvant répondre à l'appel d'offre
					for(int i = 0 ; i < nextServicesString.size() ; ++i) {
						for (int j = 0 ; j < nextServicesString.get(i).size() ; ++j) {
							Service service = nextServicesString.get(i).get(j);
							List<Ressource> capableRessources = rm.getAbleToRessource(service.getName());
							
							// Fonction choisissant la ressource la plus adaptée pour effectuer le service
							Ressource chosenRessource = capableRessources.get(0); // Error s'il n'y a rien dans capableResources
														
							// Recherche s'il y a besoin d'un transport pour atteindre la ressource
							// Dans le cas du premier service solicité, on initialise le noeud précédent à celui de la ressource choisie
							if(previousNode == null) {
								previousNode = chosenRessource.getNode();
							}else {
								if(previousNode != chosenRessource.getNode()) {									
									// Recherche d'un transport
									Ressource transport = rm.findTransport(previousNode);
									
									if(transport != null) {
										
										System.out.println(previousNode); // Effectuer déplacement de l'agv vers la ressource (transport.getNode() vers previousNode
										try {
											OutputStream out = socketArena.getOutputStream();
											String instruction = "moveYourAss";
											for(char c : instruction.toCharArray()) {
												out.write(c);
											}
											out.write('\n');

											//TODO: Réception message depuis Arena pour continuer
										
										} catch (IOException e) {
											e.printStackTrace();
										}
										
										System.out.println(previousNode); // Effectuer déplacement de l'agv (transport.getNode() vers previousNode
										
										System.out.println(chosenRessource.getNode()); // Une fois que l'agv est arrivé, effectuer le déplacement de l'agv vers chosenRessource.getNode()
										
									}
									
									previousNode = chosenRessource.getNode();
								}
							}
					
							chosenRessource.executeInstruction(service, 0);
						}
					}

				}
				
			} catch (JSONException e) {
				System.out.println("Format du fichier JSON invalide");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		// creer socket vers arena
		
		String fileContent = readFileJSON("data/ps1.json");
		
		InetAddress arenaAddr;
		try {
			arenaAddr = InetAddress.getByName(arenaAddresse);
			socketArena = new Socket(arenaAddr, port);
			new Thread(new ListenerArena(socketArena)).start();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		initialiserSysteme(fileContent);

		ServeurSocket servSocket;
		
		//creer serveur socket pour connection depuis ihm
		/*try {
			servSocket = new ServeurSocket();
			servSocket.start();
			
			//ComArena comArena = new ComArena();
			//comArena.deplAgv(1, 6);
						
		} catch (IOException e1) {
			e1.printStackTrace();
		}*/
		

	}

}
