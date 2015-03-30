package rr;

public class Generator {
	
	


	public static void run(int id){
		//add process to end of queue
		double execTime = (Math.random()*12); 
		Process pro = new Process(id, execTime); //pass in arguements of time 
		ReadyQueue.addProcess(pro);
		System.out.println("Generator: Process " +id +" loaded into ready queue.");
	}

	// This Generator method creates a new process with a given process ID and with a random execution time within a given range.

	
	public void run(int id, double min, double max) {
		
		// The random execution time is generated within the range [min, max]. It is then rounded to two decimal places.
		// The number is multiplied by 100, rounded to the nearest int, then multiplied by 100 to leave two decimals of accuracy.
		
		double execTime = Math.round((((Math.random() * (max - min)) + min))*100)/100;
		
		Process pro = new Process(id, execTime); // Creates new process with the given ID and the random execution time.  
		ReadyQueue.addProcess(pro); // Loads new process into ready queue.
		System.out.println("Generator: Process " +id +" loaded into ready queue."); // Outputs load details.
	}
}
