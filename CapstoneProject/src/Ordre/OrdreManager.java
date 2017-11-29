package Ordre;

import org.json.*;

import Produit.IProduit;
import Produit.ProduitDijkstra;
import Ressource.Ressource;
import Ressource.RessourceManager;

public class OrdreManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialisation
		// --------------
		RessourceManager ressM = new RessourceManager();
			
		
		String str = // TODO get this string with the set up of the IHM
				"{ \"ressources\":[" 
			+ 	"{ "
            +		" \"type\": 1, "
            +		" \"nb\": 3, "
            +		" \"conf\": \"../..\" "
            +	"}"
        	+"] }";
		
		JSONObject obj;
		try {
			obj = new JSONObject(str);
			JSONArray ressources = obj.getJSONArray("ressources");
			for (int i = 0; i < ressources.length(); i++)
			{
				JSONArray ressourceAtt = ressources.getJSONArray(i);
				for(int j= 0; j<ressourceAtt.length();++j)
				{
					//TODO ouverture fichier ressource.getString(2);
					for(int ii = 0; ii<ressourceAtt.getInt(1); ++ii)
					{
						//ressM.addRessource(new Ressource(attributs, id));
					}
				}
			}
				
				
		} catch (JSONException e) {
			System.out.println("Format du fichier JSON invalide - impossible d'initialiser les ressources");
			e.printStackTrace();
		}
		
		IProduit p = new ProduitDijkstra("RandomPAthToNowhere");

		
		// start of test?
		
	
		
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
