package rr;

public class Process {
	
	double id;
	double execTime;
	double tRemaining;

	/*Constructor
	 * from Generator, process could be created with random id and random execTime.
	 * since it's a new process time remaining is same as execution time.*/

	public Process(double id, double execTime) {
		this.id = id;
		this.execTime = execTime;
		this.tRemaining = execTime;
	}

	/* Method
	 * After one quantum, process updates it's time remaining as decreasing amount of quantum .
	 */

	public void afterQuantum(double quantum) {
		if (tRemaining > 0) {
			this.tRemaining = this.tRemaining - quantum; 
		}
		else
			this.tRemaining = 0;
	}
}
