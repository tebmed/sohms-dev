package produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import communication.ListenerArena;

public class ProduitDijkstra{

	private HashMap<Integer, List<Segment>> graphe;
	private ArrayList<Chemin> possiblePaths;
	private ArrayList<Chemin> tmpPaths;
	private ArrayList<Chemin> paths;

	public ProduitDijkstra(HashMap<Integer, List<Segment>> g)
	{
		graphe = g;
		possiblePaths = new ArrayList<Chemin>();
		tmpPaths = new ArrayList<Chemin>();
		paths = new ArrayList<Chemin>();
	}
	
	/**
	 * Détermine tous les chemins possibles pour aller du point start au point end
	 * @param start l'id du noeud de départ
	 * @param end l'id du noeud de fin
	 * @param possiblePath La liste de segment qui détermine le chemin
	 * @param cout le cout du chemin
	 */
	public ArrayList<Integer> applyDijkstra(int start, int end){
		if(possiblePaths.size() == 0) {
			ArrayList<Integer> init = new ArrayList<Integer>();
			init.add(start);
			Chemin initChemin = new Chemin(0, init);
			possiblePaths.add(initChemin);
		}

//		Pour chaque chemin possible
		for(Chemin chemin : possiblePaths) {
			int lastNode = chemin.getPath().get(chemin.getPath().size() - 1);

//			Cas pour un seul voisin
			if(graphe.get(lastNode).size() == 1) {
//				si le voisin n'est pas dans la liste
				int tmpVoisin = graphe.get(lastNode).get(0).getNodeTo();
				
				if(!chemin.getPath().contains(tmpVoisin)) {
					if(tmpVoisin == end) {
						chemin.getPath().add(tmpVoisin);
						chemin.setValue(chemin.getValue() + graphe.get(lastNode).get(0).getCout());
						paths.add(chemin);
					}
					else {
						chemin.getPath().add(tmpVoisin);
						tmpPaths.add(chemin);
					}
				}
			}
//			Cas pour plusieurs voisins
			else {
				
				Chemin tmpC;
				
				for(Segment s : graphe.get(lastNode)) {
					int tmpVoisin = s.getNodeTo();
					
					if(!chemin.getPath().contains(tmpVoisin)) {
						if(tmpVoisin == end) {
							chemin.getPath().add(tmpVoisin);
							chemin.setValue(chemin.getValue() + s.getCout());

							tmpC = new Chemin(chemin.getValue(), (ArrayList<Integer>) chemin.getPath());
							
							paths.add(tmpC);
							chemin.getPath().remove(chemin.getPath().size() - 1);
							chemin.setValue(chemin.getValue() - s.getCout());
						}
						else {
							chemin.getPath().add(tmpVoisin);
							
							chemin.setValue(chemin.getValue() + s.getCout());

							tmpC = new Chemin(chemin.getValue(), (ArrayList<Integer>) chemin.getPath());
							tmpPaths.add(tmpC);
							
							chemin.getPath().remove(chemin.getPath().size() - 1);
							chemin.setValue(chemin.getValue() - s.getCout());
						}
					}
				}
			}
		}
		
		if(tmpPaths.size() == 0) {
			ArrayList<Integer> finalPath = bestPath();
			return finalPath;
		}
		else {
			possiblePaths.clear();
			possiblePaths = new ArrayList<Chemin>(tmpPaths);
			tmpPaths.clear();
			
			return applyDijkstra(start, end);
		}
	}
	
	/**
	 * Détermine le meilleur chemin dans ceux qui ont été trouvés dans applyDijkstra
	 * @return le chemin avec le cout le moins élevé
	 */
	public ArrayList<Integer> bestPath() {
		int cout = Integer.MAX_VALUE;
		ArrayList<Integer> finalPath = new ArrayList<Integer>();
		
		for(Chemin chemin : paths) {
			if(chemin.getValue() < cout) {
				cout = chemin.getValue();
				finalPath = (ArrayList<Integer>) chemin.getPath();
			}
		}
		return finalPath;
	}

	public HashMap<Integer, List<Segment>> getPossiblePaths() {
		// TODO Auto-generated method stub
		return null;
	}
}
