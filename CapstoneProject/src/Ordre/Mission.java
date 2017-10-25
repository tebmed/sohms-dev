package Ordre;

import java.util.List;

import Produit.IProduit;
import Ressource.RessourceManager;

public class Mission implements IOrdre {
	private RessourceManager ressourceManager;
	private IProduit produit;
	
	
	public Mission()
	{
		ressourceManager = null;
		produit = null;
	}
	public Mission(RessourceManager ressM, IProduit p)
	{
		ressourceManager = ressM;
		produit = p;
	}
	
	@Override
	public List<String> getInstructons(String start, String end) {
		ressourceManager.getAvailableRessources();
		//TODO choose one ressource
		produit.getSubInstruction(start,end);
		return null;
	}

}
