package rr;

public class Dispatcher {
	
	public static void run () throws InterruptedException {
		while (ReadyQueue.getSize() > 0)
			CPU.process(ReadyQueue.removeProcess());
	}

}
