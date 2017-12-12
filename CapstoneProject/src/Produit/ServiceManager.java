package Produit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ressource.Ressource;

public class ServiceManager {

	private Map<String, List<Ressource>> ableTo;	// Associe à un service une liste de ressources capables de le réaliser
	private Map<Integer, String> pathAssociatedTo; 	// Associe le path réalisant le service à l'id correspondant

	
	public ServiceManager() {
		ableTo = new HashMap<String, List<Ressource>>();
		pathAssociatedTo = new HashMap<Integer, String>();
	}
	
	public Map<String, List<Ressource>> getAbleTo(){
		return ableTo;
	}
	
	// Ajout d'une ressource à la liste des ressources capables de réaliser le service donné
	public void addRessourceToService(String serviceName, Ressource ressource) {
		List<Ressource> ressources = ableTo.get(serviceName);
		ressources.add(ressource);
		ableTo.put(serviceName, ressources);
	}
	
	public Map<Integer, String> getPathAssociatedTo(){
		return pathAssociatedTo;
	}
	
	// Association du path à l'id du service correspondant
	public void addPathToService(int id, String path) {
		pathAssociatedTo.put(id, path);
	}
}
