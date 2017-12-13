package Produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import Communication.ListenerArena;

public class ProduitDijkstra{

	private HashMap<Node, List<Segment>> graphe;
	private HashMap<ArrayList<Integer>, Integer> possiblePaths;
	
	public ProduitDijkstra()
	{
		graphe = new HashMap<Node, List<Segment>>();
		possiblePaths = new HashMap<ArrayList<Integer>, Integer>();
	}
	
	public void parseJSON(JSONObject obj) throws JSONException {
		Parser p = new Parser();
		
		graphe = p.parse(obj);
	}
	
	public void applyDijkstra(int start, int end, ArrayList<Integer> possiblePath, int cout)
	{			
		//Si il est présent dans la liste possiblePath
		if(possiblePath.contains(start)) {
			//On arrete là car on est dans un chemin cyclique
			System.out.println("Chemin cyclique");
		}
		else {
			//On l'ajoute a la liste "possiblePath"
			possiblePath.add(start);
		}
		
		//Si le "start" == "end"
		if(start == end) {
			//On ajoute la liste "possiblePath" à la liste de liste "possiblepaths"
			possiblePaths.put(possiblePath, cout);
		}
		else {
			ArrayList<Segment> tmpListeSegment = (ArrayList<Segment>) graphe.get(start);
			for(Segment s : tmpListeSegment) {
				cout += s.getCout();
				applyDijkstra(s.getNodeTo(), end, possiblePath, cout);
			}
		}
	}

}
