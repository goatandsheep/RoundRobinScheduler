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
public class RRScheduler {
	
	/*
	 * from LTSA
	 * 
	 * || RR_SCHEDULER = (QUEUE || GENERATOR || DISPATCHER || CPU || GRIMREAPER).
	 * 
	 */
    public static void main(String[] args){
    	
    	Generator gen = new Generator();
    	//call generator until length of queue is reached
    	for (int i = 0 ; i<21; i++){
        	if (ReadyQueue.getSize() < 20){
        		gen.run();
        		//cap queue size at 20	
    		}
        	else{
        		gen.stop();
        	}
    	}
    	
    	
    }
}
