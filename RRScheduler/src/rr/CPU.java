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
public class CPU {
	
	/*
	 * from LTSA
	 * 
	 * CPU = (process_Execute -> process_CheckExecutionTimeRemaining -> CPU).
	 * 
	 * 
	 */
	double quantum; //quantum for the process
	
	//process goes on!
	//
	public CPU (Process currentProcess){		
		
		
	//updates remaining time!
	currentProcess.afterQuantum(quantum); //decrease remaining time 
	} 
	
	
}

