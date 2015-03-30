/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rr;

/**
 *
 * @author user
 */
public class Generator {
	
	/*from LTSA
	 * 
	 * GENERATOR = (process_Add -> GENERATOR). //generator simply keeps track of queue size
	 * 
	 * it could create a new instance of process, each w its
	 * own execution time and unique identifier of incrementing
	 * or randomly generated numbers
	 * 
	 * push processes onto the queue
	 * 
	 */
    
	
	
	//time and unique identifiers could be functions of 
	//2 different random numbers
	
	//total time to execute the process; becomes the remaining 
	//time as it is decremented by quanta each time the process
	//is reached in the queue
	public Generator(ReadyQueue queue){
	double execTime = (Math.random()*12) + 12; 
	
	double id = (Math.random()*12) + 12;
	
	Process pro = new Process(execTime, id); //pass in arguements of time 
	
	//add process to end of queue
	ReadyQueue.addProcess(pro);
	
	//length of queue
	
	int qLen = ReadyQueue.getSize();
	//wait for queue to be less than certain size before adding to
	//more processes to the end
	}
}
