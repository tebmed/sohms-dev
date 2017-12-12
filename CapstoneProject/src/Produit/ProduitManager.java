package Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitManager {
	
	private List<Produit> produitsList;
	private List<Produit> chaineProduction;
	
	public ProduitManager() {
		produitsList = new ArrayList<Produit>();
		chaineProduction = new ArrayList<Produit>();
	}
	
	public Produit getProduitAt(int i) {
		return produitsList.get(i);
	}	
	
	public void addProduit(Produit p) {
		produitsList.add(p);
	}

	public List<Produit> getChaineProduction() {
		return chaineProduction;
	}
	
	public void printProduits() {
		for(Produit p : produitsList) {
			System.out.println(p.getId());
			p.printAllServices();
		}
		
	}
}
