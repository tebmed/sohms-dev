package DB_Handler;

import java.util.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ordre.*;
import produit.*;
import ressource.*;
import sohms.communication.WebGUI;

public class DataBase implements Observer{
	
	private  WebGUI servSocket;
	private JSONObject scenario;
	
	public DataBase(WebGUI wg) {
		this.servSocket = wg;
	}
	public List<Service> getServices() throws JSONException{
		JSONArray Json_services = this.scenario.getJSONArray("services");
		List<Service> services = null;
		for (int i = 0; i < Json_services.length(); ++i) {
			JSONObject service = (JSONObject) Json_services.get(i);
			services.add((new Service(service.getInt("id"), service.getString("name"))));
		}
		return services;
	}
	
	public List<Ressource> getResources(){
		return null;
	}
	
	public List<Produit> getProduits() throws JSONException{
		JSONArray Json_products = this.scenario.getJSONArray("products");
		List<Produit> products = null;
		for (int i = 0; i < Json_products.length(); ++i) {
			JSONObject produit = (JSONObject) Json_products.get(i);
			//creer un objet java produit pour chaque produit dans le fichier JSON
			Produit p = new Produit(produit.getInt("id"), produit.getString("description"));

			//maintenant pour chaque produit initialiser les services qu'il peut realiser.
			JSONArray allServices = produit.getJSONArray("services");

			for (int j = 0; j < allServices.length(); ++j) {
				List<Integer> serviceList = new ArrayList<Integer>();
				JSONArray subArray = (JSONArray) allServices.get(j);
				for (int k = 0; k < subArray.length(); ++k)
					serviceList.add((int) subArray.get(k));
				    p.addServicesList(serviceList);
			}
			//ajouter le produit au product manager
		    products.add(p);
		}
		return products;
	}
	
	public void getOrders(){
	}
	
	public void getLayout(){
	}

	@Override
	public void update(Observable o, Object arg) {
		String fileContent= servSocket.getScenario();
		try {
			this.scenario =  new JSONObject(fileContent);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
