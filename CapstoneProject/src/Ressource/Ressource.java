package Ressource;

import java.util.List;

public class Ressource {
	
	boolean available;
	List<String> attributs;
	String id;
	
	public Ressource(List<String> attributs,String id)
	{
		available = true;
		this.attributs = attributs;
		this.id = id;
	}
	
	/** verifie si une ressource est disponible
	 * @return vrai si disponible, faux sinon
	 */
	public boolean isAvailable() {
		return false;
	}
	
	/**
	 * Mets à jour le planning de la ressource
	 */
	public void majPlanning() {
		
	}
	
	// getter && setter
	
	public List<String> getAttributs() {
		return attributs;
	}

	public void setAttributs(List<String> attributs) {
		this.attributs = attributs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public int getBattery() {
		return 0;
	}
}
