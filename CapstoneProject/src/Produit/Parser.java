package Produit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

	private static final String FILENAME = "data/Layout1.txt";
	private List<Node> listeNoeuds;
	private ArrayList<String> listeVoisins;
	private boolean present;
	
	public Parser() {
		listeNoeuds = new ArrayList<Node>();
		present = false;
	}

	public void parse() {

		BufferedReader br = null;
		FileReader fr = null;
		String sCurrentLine;
		String[] layoutParts;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while ((sCurrentLine = br.readLine()) != null) {
				//Exclusion des lignes vides
				if(sCurrentLine.length() != 0) {
					//Exclusion des lignes de commentaires
					if(sCurrentLine.charAt(0) != '#') { 

						layoutParts = sCurrentLine.split(";");
						boolean present = false;
						listeVoisins = new ArrayList<String>();
						
						for(Node n: listeNoeuds) {
							//Vérification de la présence de noeuds déjà analysés
							if(layoutParts[0].compareTo(n.getId()) == 0) {
								n.addVoisin(layoutParts[1]);
								present = true;
							}
						}
						
						//Ajout des npeuds non analysés
						if(!present) {
							listeVoisins.add(layoutParts[1]);
							listeNoeuds.add(new Node(layoutParts[0], listeVoisins));
						}
						
						present = false;								
						Arrays.fill(layoutParts, null);
					}
				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public String toString() {
		//Affichage de la version graph de layout.txt
			for(Node n: listeNoeuds) {
				System.out.println();
				System.out.println("Noeud : " + n.getId());
				System.out.println("Voisin(s)" + n.getVoisins().toString());
			}
		
		return "done";
	}
}
