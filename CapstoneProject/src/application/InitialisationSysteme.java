package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Produit.ProduitManager;
import Produit.ServiceManager;
import Ressource.RessourceManager;

public class InitialisationSysteme {
	
	public static String readFileJSON(String file) {
		
		String chaine = "";
		//lecture du fichier texte
		try{
			InputStream ips=new FileInputStream(file);
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null)
		        chaine+=ligne+"\n";
		     
		     br.close();
		     
		}    
		catch (Exception e){
			System.out.println(e.toString());
		}
	
		return chaine;
	}
	
	public static ServiceManager initialiserServices(String fileContent) throws JSONException{
		
		ServiceManager sm = new ServiceManager();
		JSONObject obj;

		obj = new JSONObject(fileContent);
		JSONArray services = obj.getJSONArray("services");

		for(int i = 0 ; i < services.length() ; ++ i) {
			JSONObject service = (JSONObject) services.get(i);
			
			sm.addPathToService(service.getInt("id_s"), service.getString("path_s"));
			
			
		}
		
		return sm;
	}
	
	public static RessourceManager initialiserRessources(String fileContent) throws JSONException{
		
		RessourceManager rm = new RessourceManager();
		JSONObject obj;

		obj = new JSONObject(fileContent);
		JSONArray ressources = obj.getJSONArray("ressources");

		for(int i = 0 ; i < ressources.length() ; ++ i) {
			JSONObject ressource = (JSONObject) ressources.get(i);
			
			for(int j = 0 ; j < ressource.getInt("nb") ; ++j) {
				rm.addRessource(ressource.getInt("id_r"));
			}
		}
		
		return rm;
	}
	
	public static ProduitManager initialiserProducts(String fileContent) throws JSONException{
		
		ProduitManager pm = new ProduitManager();
		JSONObject obj;
		
		obj = new JSONObject(fileContent);
		JSONArray produits = obj.getJSONArray("products");

		for(int i = 0 ; i < produits.length() ; ++ i) {
			JSONObject produit = (JSONObject) produits.get(i);
			
			/*for(int j = 0 ; j < ressource.getInt("nb") ; ++j) {
				//rm.addRessource(ressource.getInt("id_r"));
			}*/
		}
		
		return pm;
	}
	
	public static void main(String[] args) {

		
		String file = "ps1.json";
		String fileContent = readFileJSON(file); // TODO : lire chaine depuis IHM
		
		
		if(fileContent != "") {
			//System.out.println(fileContent);
			
			try {
				initialiserServices(fileContent);
				initialiserRessources(fileContent);
				// init avec ableTo
			
			} catch (JSONException e) {
				System.out.println("Format du fichier JSON invalide");
				e.printStackTrace();
			}
		}
		
	}

}
