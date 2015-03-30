package rr;

import java.util.*;

public class ReadyQueue {
	
	private Queue queue<Process>= new LinkedList<Process>();
	//private LinkedList<Process> queue = new LinkedList<Process>();
	//public int size;
	
	ReadyQueue() {
		queue = new LinkedList();
	}
	
	public void addProcess(Process pro) {
		this.queue.add(pro);
	}
	
	public Process removeProcess() {
		/*if (size > 0) {
			Process nextPro = this.queue.getFirst();
			this.queue.removeFirst();
			this.size--;
			return nextPro;
		}
		else
			return null;*/
		return queue.remove();
		
	}
	
	public int getSize () {
		return queue.size();
	}

}
