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
    	int i = 1;
    	while(true){
        	if (ReadyQueue.getSize() < 20){
        		
        		Generator.run(i);
        		//cap queue size at 20	
    		}
        	else{
        		try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	i++;
    	}
    	
    	
    }
}
