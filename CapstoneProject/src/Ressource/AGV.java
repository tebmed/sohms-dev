package Ressource;

public class AGV implements IRessource{


	private boolean available ;
	public AGV()
	{
		available = false;
	}
	@Override
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean b) {available = b;}

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
