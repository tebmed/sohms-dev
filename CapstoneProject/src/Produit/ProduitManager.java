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
	
	public void addProduction(Produit p,int nb,int idSeed)
	{
		for(int i=0;i<nb;++i)
		{
			chaineProduction.add(new Produit(p,idSeed+i));
		}
	}
	
	/**
	 * @param nbProduitAFaire le nombre de produit dont on souhaite connaitre le/les prochains service possible 
	 * @return une list contenant pour chaque index, une list des services possibles à executer pour le produit
	 */
	public List<List<String>> getNextService(int nbProduitAFaire)
	{
		List<List<String>> result = new ArrayList<List<String>>();
		for(int i =0;i<nbProduitAFaire;++i)
		{
			List<List<Integer>> services = chaineProduction.get(i).getServicesList();
			for(int j=0;j<services.size();++j)
			{
				//getService
			}
			
		}
		
		return result;
	}
	
}
