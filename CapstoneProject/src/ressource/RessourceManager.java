package ressource;

import java.util.ArrayList;
import java.util.List;

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
			List<Service> services = ressource.getListeService();
			for(Service s : services) {
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
	
	// getters & setters 
	
	public List<Ressource> getListRessource() {
		return availableRes;
	}
	
	public void addRessource(int id, List<Service> listService) {
		availableRes.add(new Ressource(id, listService));
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
