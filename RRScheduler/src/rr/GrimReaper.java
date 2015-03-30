package rr;

public class GrimReaper {
	
	public static void unloadProcess(Process pro){
		if (pro.getTime() == 0) {
			ReadyQueue.removeProcess();
			System.out.println("Reaper: Process " +pro.getid() +" finished executing.");
		}
		else {
			ReadyQueue.addProcess(pro); 
			System.out.println("Reaper: Process " +pro.getid() +" recycled into ready queue with " +pro.getTime() +" second(s) remaining.");
		}
	}
    
}
