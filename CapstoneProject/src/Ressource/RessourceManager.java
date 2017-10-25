package Ressource;

import java.util.ArrayList;
import java.util.List;

public class RessourceManager {
	List<IRessource> listRessource;
	
	public RessourceManager()
	{
		listRessource = new ArrayList<IRessource>();
	}
	
	public List<IRessource> getAvailableRessources()
	{
		List<IRessource> l = new ArrayList<IRessource>();
		for(IRessource ressource : listRessource)
		{
			if (ressource.isAvailable()) l.add(ressource);
		}
		return l;
	}

	
	// getters & setters 
	
	public List<IRessource> getListRessource() {
		return listRessource;
	}

	public void setListRessource(List<IRessource> listRessource) {
		this.listRessource = listRessource;
	}
	
	public void addRessource (IRessource r)
	{
		listRessource.add(r);
	}
	
}
