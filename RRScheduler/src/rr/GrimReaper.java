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
public class GrimReaper {
	
	/*
	 * from LTSA
	 * 
	 * GRIMREAPER = (process_CheckExecutionTimeRemaining -> GRIM),
	 * 
	 * GRIM = (process_Remove -> GRIMREAPER
            |process_MoveToBackOfQueue -> GRIMREAPER)
	 * 
	 */
	public void GrimReaper(Process pro){
		
	//if remaining Time!=0 move to back of queue
		if (pro.tRemaining >0){
			
			
		}
	//if remaining time=0, remove from queue  
		else if (pro.tRemaining ==0){
			
		}
		
	//if remaining time <0, show error message
		else {
			
			
			
		}
	
	}
    
}
