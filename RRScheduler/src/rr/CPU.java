package rr;

public class CPU {
	double quantum = 7; //quantum for the process
	boolean locked = false;
	
	public Process process(Process pro) throws InterruptedException {
		if (locked)
			this.wait();
		else {
			locked = true;
			pro.afterQuantum(this.quantum);
			locked = false;
			notify();
		}
		
		return pro;
				
	}
	
}
