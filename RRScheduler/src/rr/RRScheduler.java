package rr;

public class RRScheduler {

	public static void main(String[] args) throws InterruptedException {
    	int maxQ = 10;
		double minExcT =1, maxExcT = 10, quantum = 7;
		
		Thread dispatcherThread = new Dispatcher(quantum);
		Thread generatorThread = new Generator(minExcT, maxExcT, maxQ);
		
		dispatcherThread.start();
		generatorThread.start();
    }
}
