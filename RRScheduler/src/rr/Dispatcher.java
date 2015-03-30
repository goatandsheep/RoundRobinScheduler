package rr;

public class Dispatcher {
	
	public void run() throws InterruptedException {
		while (ReadyQueue.getSize() > 0) {
			Process pro = ReadyQueue.removeProcess();
			System.out.println("Dispatcher: Process " +pro.getid() +" loaded into CPU.");
			CPU.process(pro);
		}
	}

}
