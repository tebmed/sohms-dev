package Ressource;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import Produit.Service;

public class RessourceManager {
	private List<Ressource> availableRes;
	private JSONObject layout;
	
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
	
	public void addRessource(int id,List<Service> listService) {
		availableRes.add(new Ressource(id,listService));
	}
	
	public void setLayout(JSONObject layout)
	{
		this.layout = layout;
	}
	
	public JSONObject getLayout()
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
