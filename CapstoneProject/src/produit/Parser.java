package produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Parser {

	private HashMap<Integer, List<Segment>> graphe;
	private List<Node> listeNoeuds; 
	private List<Segment> listeVoisins;
	private int idSource;
	
	public Parser() {
		graphe = new HashMap<Integer, List<Segment>>();
		listeNoeuds = new ArrayList<Node>();
	}
	
	public HashMap<Integer, List<Segment>> parse(JSONObject obj) throws JSONException {

		ArrayList<Segment> tmpListeSegment;
		Node tmpNode = null;
		
		//Listage des nodes
		JSONArray nodes = obj.getJSONArray("nodes");
		
		for(int i = 0 ; i < nodes.length() ; ++i) {
			JSONObject node = (JSONObject) nodes.get(i);
			
			//Typage du node
			try {
				node.getInt("ressource");
				tmpNode = new Node(node.getInt("id"), "ressource");
				
			}catch(NullPointerException | JSONException e) {
				tmpNode = new Node(node.getInt("id"), "croisement");
			}
			
			listeVoisins = new ArrayList<Segment>();

			graphe.put(node.getInt("id"), listeVoisins);
			listeNoeuds.add(tmpNode);
		}
		
		//Listage et création des voisins via les segments
		JSONArray arcs = obj.getJSONArray("arcs");
		
		for(int i = 0 ; i < arcs.length() ; ++i) {
			JSONObject arc = (JSONObject) arcs.get(i);
			
			idSource = arc.getInt("from");
			
			//get la liste de segment pour le node associé dans listeNoeuds
			tmpListeSegment = (ArrayList<Segment>) graphe.get(idSource);
			
			if(tmpListeSegment == null) tmpListeSegment = new ArrayList<Segment>();
			
			//Ajout d'un nouveau segment pour définir un nouveau voisin
			tmpListeSegment.add(new Segment(arc.getInt("from"), arc.getInt("to"), arc.getInt("size")));
			
			graphe.replace(idSource, tmpListeSegment);
		}

		return graphe;
	}
}