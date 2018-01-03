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
	
	public Parser() {
		graphe = new HashMap<Integer, List<Segment>>();
		listeNoeuds = new ArrayList<Node>();
	}
	
	public HashMap<Integer, List<Segment>> parse(JSONObject obj) throws JSONException {

		List<Segment> listeVoisins;
		int idSource;
//		int idDest;
		ArrayList<Segment> tmpListeSegment;
		Node tmpNode = null;
		
		//Listage des nodes
		JSONArray nodes = obj.getJSONArray("nodes");
		
		for(int i = 0 ; i < nodes.length() ; ++i) {
			JSONObject node = (JSONObject) nodes.get(i);
			
			//Typage du node
			try {
				node.getInt("ressource");
				tmpNode = new Node(node.getInt("id"), node.getString("name"), "ressource");
				
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
			
			/*Partie à décommenter si cas d'un graphe non orienté*/
//			//Création du double sens
//			idDest = arc.getInt("to");
//			
//			//get la liste de segment pour le node associé dans listeNoeuds
//			tmpListeSegment = (ArrayList<Segment>) graphe.get(idDest);
//			
//			if(tmpListeSegment == null) tmpListeSegment = new ArrayList<Segment>();
//			
//			//Ajout d'un nouveau segment pour définir un nouveau voisin
//			tmpListeSegment.add(new Segment(arc.getInt("to"), arc.getInt("from"), arc.getInt("size")));
//			
//			graphe.replace(idDest, tmpListeSegment);
			/*Fin commentaire*/
		}

		return graphe;
	}

	public HashMap<Integer, List<Segment>> getGraphe() {
		return graphe;
	}

	public List<Node> getListeNoeuds() {
		return listeNoeuds;
	}
	
	public void updateCost(int noeudA, int noeudB, int cout) {
		List<Segment> tmpList = graphe.get(noeudA);
		
		for(Segment s : tmpList) {
			if(s.getNodeTo() == noeudB) {
				s.setCout(cout);
			}
		}
		
		/*Partie à décommenter si cas d'un graphe non orienté*/
//		tmpList.clear();
//		tmpList = graphe.get(noeudB);
//		
//		for(Segment s : tmpList) {
//			if(s.getNodeTo() == noeudA) {
//				s.setCout(cout);
//			}
//		}
		/*Fin commentaire*/
	}
}