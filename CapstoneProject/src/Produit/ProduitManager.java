package Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitManager {
	
	private ArrayList<String> servicesList;
	
	public ProduitManager() {
		servicesList = new ArrayList<String>();
	}
	
	/**
	 * Demande les prochains services qui peuvent être réalisés pour le produit
	 * @return la liste des services possibles
	 */
	public ArrayList<String> askNextService(){
		return servicesList;
	}
}
