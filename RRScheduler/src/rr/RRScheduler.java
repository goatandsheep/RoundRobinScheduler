package rr;

public class RRScheduler {

	public void main(String[] args) throws InterruptedException {
    	
		double min = 1.00, max = 10.00;
		
		Generator.run(min, max);
		Dispatcher.loadProcess();	
    }
}
