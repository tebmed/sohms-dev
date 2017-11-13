package Ressource;

import java.util.ArrayList;
import java.util.List;

public class RessourceManager {
	List<Ressource> listRessource;
	
	public RessourceManager()
	{
		listRessource = new ArrayList<Ressource>();
	}
	
	/**
	 * retroune les ressource disponibles
	 * @return la liste des ressources disponibles
	 */
	public List<Ressource> getAvailableRessources()
	{
		List<Ressource> l = new ArrayList<Ressource>();
		for(Ressource ressource : listRessource)
		{
			if (ressource.isAvailable()) l.add(ressource);
		}
		return l;
	}
	
	/**
	 * retourne les ressources capable d'efectuer la liste d'actions voulues
	 * @param actions les actions voulues
	 * @return la liste des ressources qui sont capable d'effectuer la listes d'actions
	 */
	public List<Ressource> getAbleToRessource(List<String> actions)
	{
		List<Ressource> l = new ArrayList<Ressource>();
		for(Ressource ressource : listRessource)
		{
			if (ressource.getAttributs().contains(actions)) l.add(ressource);
		}
		return l;
	}

	
	// getters & setters 
	
	public List<Ressource> getListRessource() {
		return listRessource;
	}

	public void setListRessource(List<Ressource> listRessource) {
		this.listRessource = listRessource;
	}
	
	public void addRessource (Ressource r)
	{
		listRessource.add(r);
	}
	
}
