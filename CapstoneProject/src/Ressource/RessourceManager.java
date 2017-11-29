package Ressource;

import java.util.ArrayList;
import java.util.List;

public class RessourceManager {
	ArrayList<Ressource> availableRes;
	
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
		List<Ressource> l = new ArrayList<Ressource>();
		for(Ressource ressource : availableRes)
		{
			//Si la ressource est capable de réaliser le service 
			l.add(ressource);
		}
		return l;
	}
	
	/**
	 * Envoi la ressource se recharger si elle est à court de batterie
	 * @param res la ressource qui doit aller se recharger
	 */
	public void toPowerOutlet(Ressource res) {
		
	}
	
	/**
	 * Retourne les ressources qui sont capables de faire le service demandé
	 * @return la liste de ressources disponibles
	 */
	public ArrayList<Ressource> requestService() {
		
		//TODO Lister les ressources qui sont capables de réaliser le service demandé
		
		return availableRes;
	}
	
	/**
	 * Réalise le service demandé
	 */
	public void doService(int idRessource) {
		
	}
	
	/**
	 * Signale une ressource en panne
	 * @param time la durée de la panne de la ressource
	 */
	public void outOfOrder(int time) {
		
	}

	/**
	 * Signale la fin d'une panne
	 */
	public void endOfOutOfOrder() {
		
	}
	
	// getters & setters 
	
	public List<Ressource> getListRessource() {
		return availableRes;
	}
	
}
