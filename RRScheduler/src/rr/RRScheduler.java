package rr;


// This RRScheduler class implements a round-robin CPU scheduler.

public class RRScheduler {

	public static void main(String[] args) throws InterruptedException {
    	int maxQ = 10; // Max size of queue.
		double minExcT = 1, maxExcT = 10, quantum = 7; // Min execution time for a process, Max execution time for a process and a value for quantum.
		
		Thread dispatcherThread = new Dispatcher(quantum); // New Dispatcher thread with value quantum.
		Thread generatorThread = new Generator(minExcT, maxExcT, maxQ); // New Generator thread with minExcT, maxExcT and maxQ values.
		
		dispatcherThread.start(); // Starting Dispatcher thread.
		generatorThread.start(); // Starting Generator thread.
    }
}
