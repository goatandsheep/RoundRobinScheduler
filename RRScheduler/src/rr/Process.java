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
public class Process {
    double id;
    double execTime;
    double tRemaining;
    
    /*Constructor
     * from Generator, process could be created with random id and random execTime.
     * since it's a new process time remaining is same as execution time.*/
    public Process(double id, double execTime){
    	this.id = id;
    	this.execTime = execTime;
    	this.tRemaining = execTime;}
    
    /* Method
     * After one quantum, process updates it's time remaining as decreasing amount of quantum .
     */
    public void afterQuantum(double quantum){
    	
    	this.tRemaining = this.tRemaining - quantum;
    	if (tRemaining <0) {
    		this.tRemaining =0;    	}
    	
    }


}
