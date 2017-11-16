package Ressource;

public class ElectricalTerminal implements IRessource {
	
	private boolean available;
	
	public ElectricalTerminal() {
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
		return false;
	}

	@Override
	public boolean canRecharge() {
		return true;
	}

	@Override
	public boolean execute(String instruction) {
		return false;
	}

}
