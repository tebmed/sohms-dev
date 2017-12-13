package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Communication.ListenerArena;
import Communication.ServeurSocket;
import Ordre.Ordre;
import Ordre.OrdreManager;
import Produit.Produit;
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
			
			sm.addPathToService(service.getInt("id"), service.getString("path"));
			sm.addNameAssociateTo(service.getInt("id"), service.getString("name"));
			
		}
		
		return sm;
	}
	
	public static RessourceManager initialiserRessources(String fileContent) throws JSONException{
		
		RessourceManager rm = new RessourceManager();
		JSONObject obj;

		obj = new JSONObject(fileContent);
		rm.setLayout(obj.getJSONObject("layoutSpec"));
		
		JSONArray ressources = obj.getJSONArray("ressources");

		for(int i = 0 ; i < ressources.length() ; ++ i) {
			JSONObject ressource = (JSONObject) ressources.get(i);
			
			for(int j = 0 ; j < ressource.getInt("nb") ; ++j) {
				List<Integer> listServices = new ArrayList<Integer>();
				JSONArray services = ressource.getJSONArray("services");
				for(int k = 0;k<services.length();++k)
				{
					listServices.add(services.getInt(k));
				}
				rm.addRessource(ressource.getInt("id"),listServices);
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
			Produit p = new Produit(produit.getInt("id"), produit.getString("description"));
			
			JSONArray allServices = produit.getJSONArray("services");
			
			for(int j = 0 ; j < allServices.length() ; ++j) {
				List<Integer> serviceList = new ArrayList<Integer>();
				JSONArray subArray = (JSONArray)allServices.get(j);
				
				for(int k = 0 ; k < subArray.length() ; ++k) {
					serviceList.add((int) subArray.get(k));
				}
				
				p.addServicesList(serviceList);
			}
			
			pm.addProduit(p);
		}
		
		return pm;
	}
	
	public static OrdreManager initialiserOrdres(String fileContent) throws JSONException{
		
		OrdreManager om = new OrdreManager();
		JSONObject obj = new JSONObject(fileContent);
		JSONArray produits = obj.getJSONArray("orders");
		
		for(int i = 0 ; i < produits.length() ; ++i) {
			JSONObject produit = (JSONObject) produits.get(i);
			
			om.addOrdre(new Ordre(produit.getInt("id"), produit.getInt("nb")));
		}
		
		return om;
	}
	
	public static void main(String[] args) {
		
		// creer socket vers arena
		int port = 1202;
		String arenaAddresse = "127.0.0.1";

		ServeurSocket servSocket;
		
		//creer serveur socket pour connection depuis ihm
		try {
			servSocket = new ServeurSocket();
			servSocket.start();
			
			InetAddress arenaAddr = InetAddress.getByName(arenaAddresse);
			Socket socketArena = new Socket(arenaAddr, port);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		String file = "ps1.json";
		String fileContent = readFileJSON(file); // TODO : lire chaine depuis IHM
		
		if(fileContent != "") {
			//System.out.println(fileContent);
			
			try {
				System.out.print("Initialisation services : ");
				ServiceManager sm = initialiserServices(fileContent);
				System.out.println("finie");
				System.out.print("Initialisation ressources : ");
				RessourceManager rm = initialiserRessources(fileContent);
				System.out.println("finie");
				System.out.print("Initialisation produits : ");
				ProduitManager pm = initialiserProducts(fileContent);
				System.out.println("finie");
				System.out.print("Initialisation ordres : ");
				OrdreManager om = initialiserOrdres(fileContent);
				System.out.println("finie");
				
				System.out.print("Initialisation annuaire de service : ");
				sm.initialiserAnnuaire(rm);
				System.out.println("finie");
				
				System.out.println("Annuaire");
				sm.printAnnuaire();
				
				
				
				
			} catch (JSONException e) {
				System.out.println("Format du fichier JSON invalide");
				e.printStackTrace();
			}
		}
		
	}

}
