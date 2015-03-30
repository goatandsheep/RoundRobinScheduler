package rr;

public class Dispatcher extends Thread {
	
	private double quantum; 
	
	
	// Dispatcher constructor. Sets the quantum value for execution.
	
	public Dispatcher(double quant) {
		this.quantum = quant;
	}
	
	
	// Thread run method.

	public void run() {
		
		try {
			loadProcess(this.quantum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// This Dispatcher method loads the next process in the ready queue to the CPU.
	
	public static void loadProcess(double quant) throws InterruptedException {
		while(true) // Run indefinitely.
		{
			if (ReadyQueue.getSize() > 0) // If the queue is not empty a process is loaded into the CPU.
			{
				Process pro = ReadyQueue.removeProcess(); // Get process from the ready queue.
				System.out.println("Dispatcher: Process " +pro.getid() +" loaded into CPU."); // Output CPU loading details.
				CPU.executeProcess(pro, quant); // Load process into CPU.
			}
			
			Thread.sleep(100); // Sleep to simulate process execution.
		}
	}
}
