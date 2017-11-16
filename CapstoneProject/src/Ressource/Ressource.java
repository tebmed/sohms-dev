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
		
	/** Fonction qui verifie si une ressource est capable d'effectuer  une certaine action
	 * @param action l'action a effectuer
	 * @return vrai si la ressource est capable d'effectuer l'action passée en parametre , faux sinon
	 */
	public boolean can(String action) {
		return false;
	}
	
	/** Demande à la ressource d'executer une instruction
	 * @param instruction l'instruction a executer
	 * @return vrai si la ressource peut executer l'instruction, faux sinon
	 */
	public boolean execute(String instruction) {
		return false;
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
	
	
}
