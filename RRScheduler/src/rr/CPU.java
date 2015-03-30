package rr;

public class CPU {
	private static double quantum = 7.00; //quantum for the process
	private static boolean locked = false;	
	private static final Object lock = new Object();
	
	public static Process process(Process pro) throws InterruptedException {
		synchronized(lock){
		    if (locked)
		    	lock.wait();
		    else {
		    	locked = true;
		    	if (pro.getTime() >= quantum)
		    		System.out.println("CPU: Process " +pro.getid() +" executed for " +quantum +" seconds.");
		    	else
		    		System.out.println("CPU: Process " +pro.getid() +" executed for " +pro.getTime() +" seconds.");
		    	pro.execute(quantum);
		    	GrimReaper.unloadProcess(pro);
		    	locked = false;
		    	lock.notify();
		   }
						
		return pro;
		}
				
	}	
}
