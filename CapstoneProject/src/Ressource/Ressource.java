package Ressource;

import java.util.List;

public class Ressource {
	
	private int id;
	private List<Integer> listeService;
	
	
	public Ressource(int id, List<Integer> listeService) {
		this.id = id;
		this.listeService = listeService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Integer> getListeService() {
		return listeService;
	}

	public void setListeService(List<Integer> listeService) {
		this.listeService = listeService;
	}
	
	
}
