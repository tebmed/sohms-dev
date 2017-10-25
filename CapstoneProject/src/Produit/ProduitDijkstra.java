package Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitDijkstra implements IProduit{

	private String pathToDijkstraFile;
	
	public ProduitDijkstra(String path)
	{
		pathToDijkstraFile = path;
	}
	
	@Override
	public List<String> getSubInstruction(String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<String> applyDijkstra(String start, String end)
	{
		List<String> l = new ArrayList<String>();
		
		// TODO implemente dijkstra
			// read file pathToDijkstraFile
			// extract path
			// apply algo on it
			// Remove this following line: 
				l.add("A to B");
				l.add("B to C");
				l.add("C to D"); // end remove
		
		return l;
	}

}
