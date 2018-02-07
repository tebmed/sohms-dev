package ordre;

public class Production {

	private int id; //l'id d'un produit
	private int nb; //la quantité de production
	
	
	public Production(int id, int nb) {
		this.id = id;
		this.nb = nb;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNb() {
		return nb;
	}
	
}
