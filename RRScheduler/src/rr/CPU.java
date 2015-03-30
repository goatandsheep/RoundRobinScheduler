package rr;

public class CPU {
	private static double quantum = 5.00; // Quantum for the process.
	private static boolean locked = false;	// Lock flag.
	private static final Object lock = new Object(); //Lock object.
	
	
	// This CPU method executes a given process.
	// During execution the CPU is locked. Only one process can be executed at a time.
	// Once done execution, GrimReaper unloads the process.
	
	public static void executeProcess(Process pro) throws InterruptedException {
		synchronized(lock){
			
			if (locked) // If locked wait to be notified.
		    		lock.wait();
		    	else // Else execute process. 
		    	{
		    		locked = true; // Lock CPU
		    		if (pro.getTime() >= quantum) // Output process execution details.
		    			System.out.println("CPU: Process " +pro.getid() +" executed for " +quantum +" seconds.");
		    		else
		    			System.out.println("CPU: Process " +pro.getid() +" executed for " +pro.getTime() +" seconds.");
		    		pro.execute(quantum); // Execute process.
		    		GrimReaper.unloadProcess(pro); // Call GrimReaper to unload process.
		    		locked = false; // Unlock CPU.
		    		lock.notify(); // Notify.
		   	}
		}
				
	}	
}
