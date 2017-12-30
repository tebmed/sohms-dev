package produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ressource.Ressource;
import ressource.RessourceManager;

public class ServiceManager {

	private Map<String, List<Ressource>> annuaire;	// Associe à un service une liste de ressources capables de le réaliser
	private List<Service> servicesList;
	 
	
	public ServiceManager() {
		annuaire = new HashMap<String, List<Ressource>>();
		servicesList = new ArrayList<Service>();
	}
	
	public Map<String, List<Ressource>> getAbleTo(){
		return annuaire;
	}
	
	public List<Service> getServicesList(){
		return servicesList;
	}
	
	public void addService(Service s) {
		servicesList.add(s);
	}
	
	// Ajout d'une ressource à la liste des ressources capables de réaliser le service donné
	public void addRessourceToService(String serviceName, Ressource ressource) {
		List<Ressource> ressources = annuaire.get(serviceName);
		if(ressources == null)
			ressources = new ArrayList<Ressource>();
		
		ressources.add(ressource);
		annuaire.put(serviceName, ressources);
	}

	public void initialiserAnnuaire(RessourceManager rm) {

		for(Ressource r : rm.getListRessource())
			for(Service service : r.getListeService().keySet())
				addRessourceToService(service.getName(),r);
		
	}
	
	public void printAnnuaire() {
		System.out.println(annuaire);
	}

	public List<List<Service>> transformServicesIdToString(List<List<Integer>> nextServicesId) {
		List<List<Service>> servicesString = new ArrayList<List<Service>>();
		
		for(int i = 0; i < nextServicesId.size() ; ++i) {
			for(int j = 0 ; j < nextServicesId.get(i).size() ; ++j) {
				List<Service> services = new ArrayList<Service>();
				for(int k = 0; k < servicesList.size() ; ++k) {
					if(nextServicesId.get(i).get(j) == servicesList.get(k).getId()) {
						services.add(servicesList.get(k));
						break;
					}
				}
				servicesString.add(services);
			}
		}
		
		return servicesString;
	}


}
