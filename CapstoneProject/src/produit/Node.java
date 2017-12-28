package produit;

public class Node {
	private int id;
	private String type;
	
	public Node(int idNode, String t) {
		id = idNode;
		type = t;
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Node)obj).id == this.id;
	}
}