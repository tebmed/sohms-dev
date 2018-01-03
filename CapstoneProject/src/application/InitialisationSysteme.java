package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import communication.ComArena;
import communication.ServeurSocket;
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
	
	private static ComArena comArena;
	
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

			sm.addService(new Service(service.getInt("id"), service.getString("name")));
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
				Map<Service, Integer> listServices = new HashMap<Service, Integer>();
				JSONArray services = ressource.getJSONArray("services");
				for (int k = 0; k < services.length(); ++k) {
					JSONObject serviceAtIndex = (JSONObject) services.get(k);
					for (Service service : sm.getServicesList()) {
						if (service.getId() == serviceAtIndex.getInt("id")) {
							listServices.put(service, serviceAtIndex.getInt("duration"));
							break;
						}
					}
				}
				rm.addRessource(ressource.getInt("id"), ressource.getString("name"), listServices);
			}
			
			
		}
		
		// Initialisation de la position des ressources
		JSONArray nodes = obj.getJSONObject("layoutSpec").getJSONArray("nodes");

		for (int k = 0 ; k < nodes.length() ; ++k) {
			JSONObject node = (JSONObject) nodes.get(k);
			for(Ressource ressourceItem : rm.getListRessource()) {
				try {
					if(node.getInt("ressource") == ressourceItem.getId())
						ressourceItem.setNode(new Node(node.getInt("id"), node.getString("name"), "ressource"));

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

//				System.out.println("Annuaire");
//				sm.printAnnuaire();
				
				
				System.out.println("Nombre d'ordres : " + om.getOrdersList().size());
				System.out.println("Nombre de ressources : " + rm.getListRessource().size());
				System.out.println("Nombre de Noeuds : " + rm.getLayout().getListeNoeuds().size());

				for(Ordre ordre : om.getOrdersList()) {
					for(Production prod : ordre.getProduits()) {
						
						List<List<Integer>> nextServicesId = pm.getNextService(prod.getNb());
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

											// Effectuer déplacement de l'agv vers la ressource (transport.getNode() vers previousNode
											System.out.println(previousNode);										
											try {
												// Envoi de l'instruction à Arena (à adapter pour l'envoi de la vraie instruction)
												comArena.deplAgv(transport.getId(), previousNode.getId());
												
												//Réception message depuis Arena pour continuer
												String message;
												do {
													message = comArena.getIn().readLine();
													System.out.println(message);
												}while(!message.startsWith("END"));
												
												// Une fois que l'agv est arrivé, effectuer le déplacement de l'agv vers chosenRessource.getNode()	
												System.out.println(chosenRessource.getNode()); 											
												
												comArena.deplAgv(transport.getId(), chosenRessource.getNode().getId());
												
												//Réception message depuis Arena pour continuer
												do {
													message = comArena.getIn().readLine();
													System.out.println(message);
												}while(!message.startsWith("END"));
												
												System.out.println("AGV arrivé à destination");
											} catch (IOException e) {
												e.printStackTrace();
											}
										}
										previousNode = chosenRessource.getNode();
									}
								}

								chosenRessource.executeInstruction(service, 0);
							}

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
		
		//String fileContent = readFileJSON("ps1.json");
		ServeurSocket servSocket;
		
		try {
			// Arena
			comArena = new ComArena();
			
			// Serveur socket IHM
			servSocket = new ServeurSocket();
			servSocket.start();
			
			//initialiserSysteme(fileContent);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
