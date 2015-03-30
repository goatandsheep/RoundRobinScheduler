package rr;

public class GrimReaper {
	
	
	// This GrimReaper method unloads a given process from the CPU. 
	// If the process has not finished executing, the process is added to the ready queue.
	
	public static void unloadProcess(Process pro){
		if (pro.getTime() == 0) // If the process finished executing output details.
			System.out.println("Reaper: Process " +pro.getid() +" finished executing.");
		else // Else add process to ready queue and output details.
		{
			ReadyQueue.addProcess(pro); 
			System.out.println("Reaper: Process " +pro.getid() +" recycled into ready queue with " +pro.getTime() +" second(s) remaining.");
		}
	}
    
}
