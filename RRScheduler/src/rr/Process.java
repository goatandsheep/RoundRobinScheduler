package rr;

public class Process {
	
	private int id;
	private double tRemaining;

	/*Constructor
	 * from Generator, process could be created with random id and random execTime.
	 * since it's a new process time remaining is same as execution time.*/

	public Process(int id, double execTime) {
		this.id = id;
		this.tRemaining = execTime;
	}

	/* Method
	 * After one quantum, process updates it's time remaining as decreasing amount of quantum .
	 */

	public void afterQuantum(double quantum) {
		if (tRemaining > 0) {
			tRemaining = tRemaining - quantum; 
		}
		else
			tRemaining = 0;
	}
	public int getid(){
		return id;
	}
	public double getTime(){
		return tRemaining;
	}
}
