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

public class OrdreManager{

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
	 
	public void launchOrders1(ProduitManager pm, ServiceManager sm, RessourceManager rm, ComArena comArena) {
		 for(Ordre ordre : ordersList) {
			  new OrderRunner(ordre, pm, sm, rm, comArena).start();
		 }
	}
	
	public void launchOrders(ProduitManager pm, ServiceManager sm, RessourceManager rm, ComArena comArena) {
		
		
		for(Ordre ordre : ordersList) {
			System.out.println("----------------------------");
			System.out.println("Ordre number : "+ordre.getId());
			for(Production prod : ordre.getProduits()) {
				List<List<Integer>> nextServicesId = pm.getNextService(prod.getNb());
				List<List<Service>> nextServicesString = sm.transformServicesIdToString(nextServicesId);
				Node previousNode = null;
				
				// Pour chaque service à  éffectuer, récupérer les ressources pouvant répondre à  l'appel d'offre
				for(int i = 0 ; i < nextServicesString.size() ; ++i) {
					for (int j = 0 ; j < nextServicesString.get(i).size() ; ++j) {
						Service service = nextServicesString.get(i).get(j);
						List<Ressource> capableRessources = rm.getCapableResources(service.getName());
						
						// Fonction choisissant la ressource la plus adaptée pour effectuer le service
						if(capableRessources.size()==0) {
							System.out.println("No ressource is capable te realize the  service : "+ service.getName() );
							break;
						}
						Ressource chosenRessource = capableRessources.get(0); // dijkistra
						System.out.println("Chosen resourceto realize the  service : "+ service.getName()+" is :"+chosenRessource.getName());

						// Recherche s'il y a besoin d'un transport pour atteindre la ressource
						// Dans le cas du premier service solicitÃ©, on initialise le noeud prÃ©cÃ©dent Ã  celui de la ressource choisie
						if(previousNode == null) {
							previousNode = chosenRessource.getNode();
						}else {
							if(previousNode != chosenRessource.getNode()) {									
								// Recherche d'un transport
								Ressource transport = rm.findTransport(previousNode);
								if(transport != null) { 
									// Effectuer déplacement de l'agv vers la ressource (transport.getNode() vers previousNode)
									try {
										// Envoi de l'instruction à  Arena (à  adapter pour l'envoi de la vraie instruction)
										int agv_id = transport.getId();
										//int agv_id1 = transport.getId();
										System.out.println("Move the AGV [id : "+agv_id+", name : "+transport.getName()+"] to the product");
										comArena.deplAgv(agv_id, previousNode.getId());
										
										//Réception message depuis Arena pour continuer
										String message;
										do {
											message = comArena.getIn().readLine();
											System.out.println(message);
										}while(!message.startsWith("END"));
										
										// Une fois que l'agv est arrivée, effectuer le dÃ©placement de l'agv vers chosenRessource.getNode()	
										System.out.println("Move the AGV with the product to the fabrication's machine");
										comArena.deplAgv(transport.getId(), chosenRessource.getNode().getId());

										//Réception message depuis Arena pour continuer
										do {
											message = comArena.getIn().readLine();
											System.out.println(message);
										}while(!message.startsWith("END"));
										
										System.out.println("AGV arrivée à destination");
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								previousNode = chosenRessource.getNode();
							}
						}
						// TODO: envoi instruction Ã  Arena pour rÃ©aliser le service
						chosenRessource.executeInstruction(service, 0);
					}
				}
			}
		}
	}
	
	//Inner Class : Order Runner Thread
	class OrderRunner extends Thread{
		
		private Ordre ordre;
		private ProduitManager pm;
		private ServiceManager sm;
		private RessourceManager rm;
		private ComArena comArena;
		
		public OrderRunner(Ordre order,ProduitManager pm,ServiceManager sm,RessourceManager rm,ComArena comArena) {
		   this.ordre = order;
		   this.pm = pm;
		   this.sm = sm;
		   this.rm = rm;
		   this.comArena = comArena;
		}

		public void run(){
		    try {
				sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("----------------------------");
			System.out.println("Ordre number : "+ordre.getId());
			for(Production prod : ordre.getProduits()) {
				List<List<Integer>> nextServicesId = pm.getNextService(prod.getNb());
				List<List<Service>> nextServicesString = sm.transformServicesIdToString(nextServicesId);
				Node previousNode = null;
				
				// Pour chaque service à  éffectuer, récupérer les ressources pouvant répondre à  l'appel d'offre
				for(int i = 0 ; i < nextServicesString.size() ; ++i) {
					for (int j = 0 ; j < nextServicesString.get(i).size() ; ++j) {
						Service service = nextServicesString.get(i).get(j);
						
						List<Ressource> capableRessources = rm.getCapableResources(service.getName());
						
						// Fonction choisissant la ressource la plus adaptée pour effectuer le service
						if(capableRessources.size()==0) {
							System.out.println("No ressource is capable te realize the  service : "+ service.getName() );
							break;
						}
						Ressource chosenRessource = capableRessources.get(0); // dijkistra
						chosenRessource.setState(ressource.State.BUSY);
						System.out.println("Chosen resourceto realize the  service : "+ service.getName()+" is :"+chosenRessource.getName());

						// Recherche s'il y a besoin d'un transport pour atteindre la ressource
						// Dans le cas du premier service solicitÃ©, on initialise le noeud prÃ©cÃ©dent Ã  celui de la ressource choisie
						if(previousNode == null) {
							previousNode = chosenRessource.getNode();
						}else {
							if(previousNode != chosenRessource.getNode()) {									
								// Recherche d'un transport
								Ressource transport = rm.findTransport(previousNode);
								if(transport != null) { 
									// Effectuer déplacement de l'agv vers la ressource (transport.getNode() vers previousNode)
									try {
										// Envoi de l'instruction à  Arena (à  adapter pour l'envoi de la vraie instruction)
										int agv_id = transport.getId();
										//int agv_id1 = transport.getId();
										System.out.println("Move the AGV [id : "+agv_id+", name : "+transport.getName()+"] to the product");
										comArena.deplAgv(agv_id, previousNode.getId());
										
										//Réception message depuis Arena pour continuer
										String message;
										do {
											message = comArena.getIn().readLine();
											System.out.println(message);
										}while(!message.startsWith("END"));
										
										// Une fois que l'agv est arrivée, effectuer le dÃ©placement de l'agv vers chosenRessource.getNode()	
										System.out.println("Move the AGV with the product to the fabrication's machine");
										comArena.deplAgv(transport.getId(), chosenRessource.getNode().getId());

										//Réception message depuis Arena pour continuer
										do {
											message = comArena.getIn().readLine();
											System.out.println(message);
										}while(!message.startsWith("END"));
										
										System.out.println("AGV arrivée à destination");
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								previousNode = chosenRessource.getNode();
							}
						}
						// TODO: envoi instruction Ã  Arena pour rÃ©aliser le service
						chosenRessource.executeInstruction(service, 0);
						chosenRessource.setState(ressource.State.AVAILABLE);

					}
				}
			}
		}
	}
}
