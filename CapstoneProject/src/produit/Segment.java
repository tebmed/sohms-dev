package produit;

public class Segment {

	private int nodeFrom;
	private int nodeTo;
	private int cout;
	
	public Segment(int nf, int nt, int c) {
		nodeFrom = nf;
		nodeTo = nt;
		cout = c;
	}

	public int getNodeFrom() {
		return nodeFrom;
	}

	public void setNodeFrom(int nodeFrom) {
		this.nodeFrom = nodeFrom;
	}

	public int getNodeTo() {
		return nodeTo;
	}

	public void setNodeTo(int nodeTo) {
		this.nodeTo = nodeTo;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	@Override
	public String toString() {
		return "Segment [nodeFrom=" + nodeFrom + ", nodeTo=" + nodeTo + ", cout=" + cout + "]";
	}
}
