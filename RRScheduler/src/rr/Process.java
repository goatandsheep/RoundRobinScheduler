package rr;


// This Process class models a process object.

public class Process {
	
	private int id; // Process ID.
	private double tRemaining; // Execution time remaining for the process. 

	// Process constructor. Arguments are the process ID and the total execution time.
	
	public Process(int id, double execTime) {
		this.id = id;
		this.tRemaining = execTime; // The time remaining is initialized as the total execution time.
	}

	// This Process method executes the process task and changes the process' remaining execution time.
	
	public void execute(double quantum) {
		if (tRemaining > quantum) // If the process' execution time is greater than quantum, decrease the time remaining by quantum.
			tRemaining = tRemaining - quantum; 
		else // Else time remaining is 0 and the process is done executing.
			tRemaining = 0;
	}
	
	// Get process ID value.
	
	public int getid() {
		return id;
	}
	
	// Get process time remaining value.
	
	public double getTime() {
		return tRemaining;
	}
}
