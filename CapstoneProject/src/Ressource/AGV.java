package Ressource;

public class AGV implements IRessource{

	private boolean available ;
	
	public AGV() {
		available = false;
	}
	
	public void setAvailable(boolean b) {
		available = b;
	}
	
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	@Override
	public boolean canLift() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canRecharge() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean execute(String instruction) {
		// TODO Auto-generated method stub
		return false;
	}

}
