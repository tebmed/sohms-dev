package produit;

public class Service {

	private int id;
	private String name;
	
	public Service(int id, String name, int duration) {
		this.id = id;
		this.name = name;
	}
	
	public Service(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + "]";
	}
	
	
}
