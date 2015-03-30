package rr;

public class Generator extends Thread {
	
	private int maxQ;
	private double minExcT, maxExcT;
	
	
	// Generator constructor. Sets variables passed from RRScheduler.
	
	public Generator (double min, double max, int q)
	{
		this.minExcT = min;
		this.maxExcT = max;
		this.maxQ = q;
	}
	
	
	// Thread run method.
	
	public void run () {
		try {
			execute();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// This Generator method creates a new process with an ID and a random execution time within a given range.
	
	public void execute() throws InterruptedException {
		
		int id = 1; // Process ID is a counter.
		
		while (true) // Run indefinitely. 
		{
			
			if (ReadyQueue.getSize() < this.maxQ) // If the ready queue size is less then 20 create a new process. 
			{
		    	    	
				// The random execution time is generated within the range [min, max]. It is then rounded to two decimal places.
				// The number is multiplied by 100, rounded to the nearest int, then multiplied by 100 to leave two decimals of accuracy.
				
				double execTime = Math.round((((Math.random() * (this.maxExcT - this.minExcT)) + this.minExcT))*100)/100;
				
				Process pro = new Process(id, execTime); // Creates new process with the given ID and the random execution time.  
				System.out.println("Generator: Process " +id +" loaded into ready queue."); // Outputs load details.
				ReadyQueue.addProcess(pro); // Loads new process into ready queue.
				id++; // Increment ID counter.
			}
			
			Thread.sleep(50); 
		}
	}
}
