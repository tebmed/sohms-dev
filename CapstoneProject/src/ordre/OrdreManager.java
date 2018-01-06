package ordre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import communication.ComArena;
import produit.Node;
import produit.ProduitManager;
import produit.Service;
import produit.ServiceManager;
import ressource.Ressource;
import ressource.RessourceManager;

public class OrdreManager {

	private List<Ordre> ordersList;
	
	public OrdreManager() {
		ordersList = new ArrayList<Ordre>();
	}
	
	public void addOrdre(Ordre o) {
		ordersList.add(o);
	}
	
	public List<Ordre> getOrdersList(){
		return ordersList;
	}
	
	public void printOrders() {
		for(Ordre o : ordersList)
			System.out.println(o.getId() + ",");
	}
	
	
	public void launchOrders(ProduitManager pm, ServiceManager sm, RessourceManager rm, ComArena comArena) {
		
		for(Ordre ordre : ordersList) {
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
						// TODO: envoi instruction à Arena pour réaliser le service
						chosenRessource.executeInstruction(service, 0);
					}

				}
			}
		}
	}
	
}
