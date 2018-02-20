 package produit;

import java.util.ArrayList;
import java.util.List;

public class Produit implements Cloneable{
	
	private int id;
	private String description;
	private List<List<Integer>> servicesList; 
	/* Regroupe la liste des services ordonnés
	nécessaires à la réalisation du produit 
	Chaque indice de cette liste correspond à une liste 
	de services qui peuvent être executer dans n'importe 
	quel ordre (pas de dépendances). A la condition que les indices précédents ont été réalisés*/

	public Produit(int id, String description) {
		this.id = id;
		this.description = description;
		this.servicesList = new ArrayList<List<Integer>>();
	}

	public Produit(Produit p, int idProduit) {
		this.id = idProduit;
		this.description = p.getDescription();
		
		List<List<Integer>> cloneServiceList = new ArrayList<List<Integer>>();
		
		for(List<Integer> list : p.getServicesList()) {
			List<Integer> cloneList = new ArrayList<Integer>();
			
			for(Integer serviceId : list)
				cloneList.add(serviceId);
			
			cloneServiceList.add(cloneList);
		}
		
		this.servicesList = cloneServiceList;
	}
	
	public List<List<Integer>> getServicesList() {
		return servicesList;
	}

	public void setServicesList(List<List<Integer>> servicesList) {
		this.servicesList = servicesList;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	// Ajout d'une liste de services à l'ensemble des services
	public void addServicesList(List<Integer> services) {
		servicesList.add(services);
	}
	
	public void printAllServices() {
		for(List<Integer> list : servicesList) {
			System.out.print("List : " );
			for(int service : list)
				System.out.print(service + ",");
			    System.out.println();
		}
	}
}
