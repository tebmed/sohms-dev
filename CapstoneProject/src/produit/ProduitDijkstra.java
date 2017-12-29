package produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;

import communication.ListenerArena;

public class ProduitDijkstra{

	private HashMap<Integer, List<Segment>> graphe;
	private HashMap<ArrayList<Integer>, Integer> possiblePaths;

	public ProduitDijkstra()
	{
		graphe = new HashMap<Integer, List<Segment>>();
		possiblePaths = new HashMap<ArrayList<Integer>, Integer>();
	}
	
	public void parseJSON(JSONObject obj) throws JSONException {
		Parser p = new Parser();
		
		this.graphe = p.parse(obj);
	}
	
	/**
	 * Détermine tous les chemins possibles pour aller du point start et point end
	 * @param start l'id du noeud de départ
	 * @param end l'id du noeud de fin
	 * @param possiblePath La liste de segment qui détermine le chemin
	 * @param cout le cout du chemin
	 */
	public void applyDijkstra(int start, int end, ArrayList<Integer> possiblePath, int cout)
	{		
		System.out.println(this.graphe.toString());
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
			
			if(tmpListeSegment != null) {
				System.out.println(tmpListeSegment.toString());
			}
			else {
				System.out.println("ee");
			}
			
			/*for(Segment s : tmpListeSegment) {
				cout += s.getCout();
				applyDijkstra(s.getNodeTo(), end, possiblePath, cout);
			}*/
		}
		
		
	}

	public ArrayList<Integer> bestPath(){
		
		int cout = 10000;
		ArrayList<Integer> path = null;
		ArrayList<Integer> cle;
		int valeur;
		
		for(Entry<ArrayList<Integer>, Integer> entry : possiblePaths.entrySet()) {
			cle = entry.getKey();
		    valeur = entry.getValue();
		    
		    if(valeur <= cout) {
		    	cout = valeur;
		    	path = cle;
		    }
		}
		
		return path;
	}
	
	public HashMap<ArrayList<Integer>, Integer> getPossiblePaths() {
		return possiblePaths;
	}
}
