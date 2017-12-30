package ordre;

import java.util.ArrayList;
import java.util.List;

import produit.Produit;

public class Ordre {

	private int id;
	private List<Production> produits;
	
	public Ordre(int id) {
		this.id = id;
		this.produits = new ArrayList<Production>();
	}
	
	public int getId() {
		return id;
	}
	
	public List<Production> getProduits(){
		return this.produits;
	}
	
	public void addProduit(Production p) {
		produits.add(p);
	}
	
}
