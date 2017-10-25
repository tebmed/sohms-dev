package Ressource;

public interface IRessource {
	public boolean isAvailable();
	public boolean canLift();
	public boolean canRecharge();
	public boolean execute(String instruction);
		
}
