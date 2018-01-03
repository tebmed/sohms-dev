package produit;

import java.util.ArrayList;
import java.util.List;

public class Chemin {
	private int value;
	private List<Integer> path;
	
	public Chemin(int v, ArrayList<Integer> p) {
		value = v;
		path = new ArrayList<Integer>(p);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<Integer> getPath() {
		return path;
	}

	public void setPath(List<Integer> path) {
		this.path = path;
	}
}
