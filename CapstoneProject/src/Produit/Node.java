package Produit;

import java.util.ArrayList;

public class Node {
	private String id;
	private ArrayList<String> voisins;
	
	public Node(String idNode, ArrayList<String> vois) {
		id = idNode;
		voisins = vois;
	}
	
	public String getId() {
		return id;
	}
	
	public ArrayList<String> getVoisins(){
		return voisins;
	}
	
	public void addVoisin(String newVoisin) {
		voisins.add(newVoisin);
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", voisins=" + voisins + "]";
	}
}
