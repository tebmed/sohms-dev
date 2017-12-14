package produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Parser {

	private HashMap<Node, List<Segment>> listeNoeuds;
	private List<Segment> listeVoisins;
	private int idSource;
	
	public Parser() {
		listeNoeuds = new HashMap<Node, List<Segment>>();
	}
	
	public HashMap<Node, List<Segment>> parse(JSONObject obj) throws JSONException {

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
			
			listeNoeuds.put(tmpNode, listeVoisins);
		}
		
		//Listage et création des voisins via les segments
		JSONArray arcs = obj.getJSONArray("arcs");
		
		for(int i = 0 ; i < arcs.length() ; ++i) {
			JSONObject arc = (JSONObject) arcs.get(i);
			
			idSource = arc.getInt("from");
			
			//get la liste de segment pour le node associé dans listeNoeuds
			tmpListeSegment = (ArrayList<Segment>) listeNoeuds.get(idSource);
			
			//Ajout d'un nouveau segment pour définir un nouveau voisin
			//tmpListeSegment.add(new Segment(arc.getInt("from"), arc.getInt("to"), arc.getInt("size")));
		}
		
		//System.out.println(listeNoeuds);
		return listeNoeuds;
	}
	
	
}