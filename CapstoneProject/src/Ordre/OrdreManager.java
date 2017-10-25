package Ordre;

import Produit.IProduit;
import Produit.ProduitDijkstra;
import Ressource.RessourceManager;

public class OrdreManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialisation
		// --------------
		RessourceManager ressM = new RessourceManager();
			// TODO initial loading of ressources
		IProduit p = new ProduitDijkstra("RandomPAthToNowhere");
		Mission m = new Mission(ressM,p);
		
		// start of test?
		m.helloWorld();
		for(String s : m.getInstructons("deb", "fin")) {
			System.out.println(s);
		}
	}

}
