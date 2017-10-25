package Ressource;

import java.util.ArrayList;
import java.util.List;

public class RessourceManager {
	List<IRessource> listRessource;
	
	public RessourceManager()
	{
		listRessource = null;
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
	
}
