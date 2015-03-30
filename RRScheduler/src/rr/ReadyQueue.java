package rr;

import java.util.*;


// This ReadyQueue class models a ready queue object.

public class ReadyQueue {
	
	// Instantiating LinkedList theQueue that will be used as a ready queue.
	
	private static Queue<Process> theQueue= new LinkedList<Process>();
	
	// This ReadyQueue method adds a given process the end of the ready queue.
	
	public static void addProcess(Process pro) {
		theQueue.add(pro); // Add process to the queue.
	}
	
	// This ReadyQueue method removes the next process in the ready queue and returns a copy of the object.
	
	public static Process removeProcess() {
		if (getSize() > 0) // If the queue is greater than 0, remove/return the next process.
			return theQueue.remove();
		else // Else return null.
			return null;
	}
	
	// Get ready queue size value.
	
	public static int getSize() {
		return theQueue.size();
	}
}
