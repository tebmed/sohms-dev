package produit;

public class Node {
	private int id;
	private String name;
	private String type;
	
	public Node(int idNode, String type) {
		this.id = idNode;
		this.type = type;
	}
	
	public Node(int idNode, String name, String type) {
		this.id = idNode;
		this.name = name;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name +", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Node)obj).id == this.id;
	}
}