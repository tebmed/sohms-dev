package Ressource;

import java.util.List;

import Produit.Service;

public class Ressource {
	
	private int id;
	private List<Service> listeService;
	
	
	public Ressource(int id, List<Service> listeService) {
		this.id = id;
		this.listeService = listeService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Service> getListeService() {
		return listeService;
	}

	public void setListeService(List<Service> listeService) {
		this.listeService = listeService;
	}
	
	public String toString() {
		String s = "";
		for(int i=0;i<listeService.size();++i)
			s += listeService.get(i).toString();
		
		return s + "\n";
	}
}
