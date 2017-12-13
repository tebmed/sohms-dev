package Produit;

public class Service {

	private int id;
	private String name;
	private int duration;
	private String path;
	
	public Service(int id, String name, int duration, String path) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.path = path;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	
	
	public String getPath() {
		return this.path;
	}
	
}
