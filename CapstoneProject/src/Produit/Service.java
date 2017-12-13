package Produit;

public class Service {

	private int id;
	private String name;
	private int duration;
	
	public Service(int id, String name, int duration) {
		this.id = id;
		this.name = name;
		this.duration = duration;
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
	
}
