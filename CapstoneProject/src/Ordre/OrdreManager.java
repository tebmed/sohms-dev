package Ordre;

import java.io.FileNotFoundException;

import org.json.*;

import Communication.SoHMSMock;
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
		
		// Utilisation du SoHMS
		/*SoHMSMock mock = new SoHMSMock();
		try{
			mock.InterfaceMock();
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}*/
		
		String str = // TODO get this string with the set up of the IHM
				"{ \"ressources\":[" 
			+ 	"{ "
            +		" \"type\": 1, "
            +		" \"nb\": 3, "
            +		" \"conf\": \"../..\", "
            +	"}"
        	+"] }";
		
		JSONObject obj;
		try {
			obj = new JSONObject(str);
			JSONArray ressources = obj.getJSONArray("ressources");
			for (int i = 0; i < ressources.length(); i++)
			{
				System.out.println(ressources);
				JSONObject ressourceAtt = ressources.getJSONObject(i);
				System.out.println("ressourceAtt + " + ressourceAtt);
				for(int j= 0; j<ressourceAtt.getInt("nb");++j)
				{
					System.out.println("OrdreManager -> JSONParse -> ressourceAtt.getInt(\"nb\"): hellooooo");
					//TODO ouverture fichier ressource.getString(2);
					/*for(int ii = 0; ii<ressourceAtt.getInt(1); ++ii)
					{
						//ressM.addRessource(new Ressource(attributs, id));
					}*/
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
