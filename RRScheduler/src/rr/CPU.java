package rr;

public class CPU {
	double quantum; //quantum for the process
	boolean locked;

	public CPU (double quan){
		this.quantum = quan;
		this. locked = false;
	}
	
	public void process(Process pro) throws InterruptedException {
		if (locked)
			this.wait();
		else {
			locked = true;
			pro.afterQuantum(this.quantum);
			locked = false;
			notify();
		}
				
	}
	
}
