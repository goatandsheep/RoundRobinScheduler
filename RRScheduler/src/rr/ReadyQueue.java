package rr;

import java.util.*;

public class ReadyQueue {
	
	private LinkedList<Process> queue = new LinkedList<Process>();
	public int size;
	
	ReadyQueue() {
		this.size=0;		
	}
	
	public void addProcess(Process pro) {
		this.queue.addLast(pro);
		this.size++;
		notify();
	}
	
	public Process removeProcess() {
		if (size > 0) {
			Process nextPro = this.queue.getFirst();
			this.queue.removeFirst();
			this.size--;
			return nextPro;
		}
		else
			return null;
		
	}
	
	public int size () {
		return this.size();
	}

}
