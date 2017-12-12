package Ressource;

import java.util.ArrayList;
import java.util.List;

public class RessourceManager {
	private List<Ressource> availableRes;
	
	public RessourceManager()
	{
		availableRes = new ArrayList<Ressource>();
	}
	
	/**
	 * retourne les ressources capable d'efectuer la liste d'actions voulues
	 * @param actions les actions voulues
	 * @return la liste des ressources qui sont capable d'effectuer la listes d'actions
	 */
	public List<Ressource> getAbleToRessource(String service)
	{
		return null;
	}
	
	// getters & setters 
	
	public List<Ressource> getListRessource() {
		return availableRes;
	}
	
	public void addRessource(int id) {
		availableRes.add(new Ressource(id));
	}
	
}
