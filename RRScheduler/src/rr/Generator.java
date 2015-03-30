package rr;

public class Generator extends Thread {
	
	// This Generator thread creates a new process with an ID and a random execution time within a given range.
	
	static Thread run(double min, double max) throws InterruptedException {
		
		int id = 1; // Process ID is a counter.
		
		while (true) // Run indefinitely. 
		{
			
			if (ReadyQueue.getSize() < 20) // If the ready queue size is less then 20 create a new process. 
			{
		    	    	
				// The random execution time is generated within the range [min, max]. It is then rounded to two decimal places.
				// The number is multiplied by 100, rounded to the nearest int, then multiplied by 100 to leave two decimals of accuracy.
				
				double execTime = Math.round((((Math.random() * (max - min)) + min))*100)/100;
				
				Process pro = new Process(id, execTime); // Creates new process with the given ID and the random execution time.  
				ReadyQueue.addProcess(pro); // Loads new process into ready queue.
				System.out.println("Generator: Process " +id +" loaded into ready queue."); // Outputs load details.
				id++; // Increment ID counter.
			}
			else // Else sleep for 1 second.
	    		Thread.sleep(1000);
		}
	}
}
