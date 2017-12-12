package Produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ressource.Ressource;
import Ressource.RessourceManager;

public class ServiceManager {

	private Map<String, List<Ressource>> ableTo;	// Associe à un service une liste de ressources capables de le réaliser
	private Map<Integer, String> pathAssociatedTo; 	// Associe le path réalisant le service à l'id correspondant
	private Map<Integer, String> nameAssociateTo; // associe un id a un nom de service
	
	public ServiceManager() {
		ableTo = new HashMap<String, List<Ressource>>();
		pathAssociatedTo = new HashMap<Integer, String>();
		nameAssociateTo = new HashMap<Integer, String>();
	}
	
	public Map<String, List<Ressource>> getAbleTo(){
		return ableTo;
	}
	
	// Ajout d'une ressource à la liste des ressources capables de réaliser le service donné
	public void addRessourceToService(String serviceName, Ressource ressource) {
		List<Ressource> ressources = ableTo.get(serviceName);
		if(ressources == null)
			ressources = new ArrayList<Ressource>();
		
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
	
	public void addNameAssociateTo(int id, String name) {
		nameAssociateTo.put(id, name);
	}

	public void initialiserAnnuaire(RessourceManager rm) {
		// TODO Auto-generated method stub
		for(Ressource r : rm.getListRessource())
		{
			for(Integer service : r.getListeService())
			{
				addRessourceToService(nameAssociateTo.get(service),r);
			}
		}
	}
	
	public void printAnnuaire() {
		System.out.println(ableTo);
	}
}
