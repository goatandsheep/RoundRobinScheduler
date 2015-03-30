package rr;

public class Dispatcher {
	
	
	// This Dispatcher thread loads the next process in the ready queue to the CPU.
	
	public static Thread loadProcess() throws InterruptedException {
		while(true) // Run indefinitely.
		{
			if (ReadyQueue.getSize() > 0) // If the queue is not empty a process is loaded into the CPU.
			{
				Process pro = ReadyQueue.removeProcess(); // Get process from the ready queue.
				System.out.println("Dispatcher: Process " +pro.getid() +" loaded into CPU."); // Output CPU loading details.
				CPU.executeProcess(pro); // Load process into CPU.
			}
			
			Thread.sleep(100);
		}
	}
}
