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
    public void main(String[] args){
    	
    	while(true){
        	if (ReadyQueue.getSize() < 20){
        		Generator.run();
        		//cap queue size at 20	
    		}
        	else{
        		wait();
        	}
    	}
    	
    	
    }
}
