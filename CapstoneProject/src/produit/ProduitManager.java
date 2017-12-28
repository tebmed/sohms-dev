package produit;

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
	
	
	public Produit findProduct(int id) {
		
		for(Produit prod : produitsList)
			if(prod.getId() == id)
				return prod;
		
		return null;
	}
	
	public void addProduction(int productId,int nb,int idSeed)
	{
		Produit p = findProduct(productId);
		
		if(p != null)
			for(int i = 0 ; i < nb ; ++i)
				chaineProduction.add(new Produit(p,idSeed+i));

	}
	
	/**
	 * @param nbProduitAFaire le nombre de produit dont on souhaite connaitre le/les prochains service(s) possible(s)
	 * @return une liste contenant pour chaque index, une liste des services possibles à executer pour le produit
	 */
	public List<List<Integer>> getNextService(int nbProduitAFaire)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i =0;i<nbProduitAFaire;++i){
			List<List<Integer>> services = chaineProduction.get(i).getServicesList();
			
			for(int j = 0; j < services.size() ; ++j)
				result.add(services.get(j));
			
			
		}
		
		return result;
	}
	
}
