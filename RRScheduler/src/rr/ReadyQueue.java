package rr;

import java.util.*;

public class ReadyQueue {
	
	private static Queue theQueue<Process>= new LinkedList<Process>();
	//private LinkedList<Process> queue = new LinkedList<Process>();
	//public int size;
	/*
	ReadyQueue() {
		theQueue = new LinkedList();
	}*/
	
	public static void addProcess(Process pro) {
		theQueue.add(pro);
	}
	
	public static Process removeProcess() {
		if (getSize() > 0) {
			/*Process nextPro = this.queue.getFirst();
			this.queue.removeFirst();
			this.size--;
			return nextPro;*/
			
			return theQueue.remove();
		}
		else
			return null;
		
	}
	
	public static int getSize() {
		return theQueue.size();
	}

}
