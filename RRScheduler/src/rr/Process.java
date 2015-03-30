package rr;

public class Process {
	
	private int id;
	private double tRemaining;

	public Process(int id, double execTime) {
		this.id = id;
		this.tRemaining = execTime;
	}

	public void execute(double quantum) {
		if (tRemaining > quantum)
			tRemaining = tRemaining - quantum; 
		else
			tRemaining = 0;
	}
	
	public int getid() {
		return id;
	}
	
	public double getTime() {
		return tRemaining;
	}
}
