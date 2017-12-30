package ressource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import produit.Node;
import produit.Parser;
import produit.Service;

public class RessourceManager {
	private List<Ressource> availableRes;
	private Parser layout;
	
	public RessourceManager()
	{
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
	
	public void reserveRessource(Ressource ressource) {
		
	}
	
	public Ressource findTransport(Node nodeToReach) {
		
		Ressource transport = null;
		int lowestValue = Integer.MAX_VALUE;
		
		/*for(Ressource ressource : availableRes) {
			List<Service> services = ressource.getListeService();
			for(Service s : services) {
				if(s.getName().equals("deplacement")) {
					int minValue = Integer.MAX_VALUE;
					ProduitDijkstra dijkstra = new ProduitDijkstra();
					dijkstra.applyDijkstra(ressource.getNode().getId(), nodeToReach.getId(), new ArrayList<Integer>() , 1);
					
					ArrayList<Integer> values = (ArrayList<Integer>) dijkstra.getPossiblePaths().values();
					
					if(values != null) {
						 minValue = values.get(0);
						for(Integer value : values) {
							if(value < minValue)
								minValue = value;
						}
					}
					
					if(minValue < lowestValue) {
						lowestValue = minValue;
						transport = ressource;
					}					
				}
			}
		}
		
		System.out.println("Lowest value : " + lowestValue);
		
		return transport;*/
		
		// Temporairement on prend la première ressource pouvait déplacer (Dijkstra ne fonctionnant pas)
		for(Ressource ressource : availableRes) {
			Map<Service,Integer> services = ressource.getListeService();
			for(Service s : services.keySet()) {
				if(s.getName().equals("deplacement"))
					return ressource;
			}
		}
		
		return null;
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
