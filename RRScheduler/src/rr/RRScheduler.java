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
    	ReadyQueue queue = new ReadyQueue();
    	Generator gen = new Generator(queue);
    }
}
