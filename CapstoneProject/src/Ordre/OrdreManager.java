package Ordre;

import Produit.IProduit;
import Produit.ProduitDijkstra;
import Ressource.AGV;
import Ressource.ElectricalTerminal;
import Ressource.RessourceManager;

public class OrdreManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialisation
		// --------------
		RessourceManager ressM = new RessourceManager();
			// TODO initial loading of ressources with IHM
			for(int i = 0;i<5;++i)
			{
				ressM.addRessource(new AGV());
				ressM.addRessource(new ElectricalTerminal());
			}
		IProduit p = new ProduitDijkstra("RandomPAthToNowhere");
		Mission m = new Mission(ressM,p);
		
		// start of test?
		m.helloWorld();
		for(String s : m.getInstructons("deb", "fin")) {
			System.out.println(s);
		}
		
		// TODO list of all the order
		// IHM.giveALLOrder()
		// foreach -> getSubInstruction
		// 		foreach subinstruction -> settimer to next ending instruction
										// is path still usable?
		
		
		
		// TODO
		// Make a runtime who refresh the execution time of instructions each time an instruction end
		// Make a resume of this result
	}

}
