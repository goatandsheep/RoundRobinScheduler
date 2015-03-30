package rr;

public class CPU {
	private static double quantum = 7; //quantum for the process
	private static boolean locked = false;	
	private static final Object lock = new Object();
	
	public static Process process(Process pro) throws InterruptedException {
		synchronized(lock){
		    if (locked)
		    	lock.wait();
		    else {
		    	locked = true;
		    	pro.afterQuantum(quantum);
		    	locked = false;
		    	lock.notify();
		   }
						
		return pro;
		}
				
	}	
}
