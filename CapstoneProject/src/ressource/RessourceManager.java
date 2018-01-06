package ressource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import produit.Node;
import produit.Parser;
import produit.ProduitDijkstra;
import produit.Service;

public class RessourceManager {
	private List<Ressource> availableRes;
	private Parser layout;
	
	public RessourceManager(){
		availableRes = new ArrayList<Ressource>();
	}
	
	/**
	 * retourne les ressources capable d'effectuer la liste d'actions voulues
	 * @param service le service souhaité
	 * @return la liste des ressources qui sont capable d'effectuer le service
	 */
	public List<Ressource> getAbleToRessource(String service)
	{
		List<Ressource> ablesTo = new ArrayList<Ressource>();
				
		for(Ressource ressource : availableRes) {
			Map<Service, Integer> services = ressource.getListeService();
			for(Service s : services.keySet()) {
				if(s.getName() == service) {
					ablesTo.add(ressource);
					break;
				}
			}
		}
		
		return ablesTo;
	}
	
	public Ressource findTransport(Node nodeToReach) {
		
		Ressource transport = null;
		int minValue = Integer.MAX_VALUE;
		ArrayList<Integer> chemin = new ArrayList<Integer>();
		
		for(Ressource ressource : availableRes) {
			Map<Service, Integer> services = ressource.getListeService();
			for(Service s : services.keySet()) {
				if(s.getName().equals("deplacement")) {
					ProduitDijkstra dijkstra = new ProduitDijkstra(this.getLayout().getGraphe());
					chemin = dijkstra.applyDijkstra(ressource.getNode().getId(), nodeToReach.getId());

					if(chemin != null) {
						if(chemin.size() < minValue) {
							transport = ressource;
							minValue = chemin.size();
						}
							
					}
				}
			}
		}
		
		return transport;
	}
	
	// getters & setters 
	
	public List<Ressource> getListRessource() {
		return availableRes;
	}
	
	public void addRessource(int id, String name, Map<Service, Integer> listService) {
		availableRes.add(new Ressource(id, name, listService));
	}
	
	public void setLayout(Parser layout)
	{
		this.layout = layout;
	}
	
	public Parser getLayout()
	{
		return this.layout;
	}
	
	public String toString() {
		String s = "";
		
		for(Ressource res : availableRes)
			s += res.toString();
			
		return s + "\n";
	}
}
