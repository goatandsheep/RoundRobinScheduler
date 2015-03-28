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
public class ReadyQueue {
    
	/*from LTSA
	 * 
	 * QUEUE = QUEUE[0],
	 * QUEUE[x:0..Max] = (when (x<Max) process_Add -> QUEUE[x+1]
                                    | when (x>0) process_MoveToCPU -> CONTROL[x]),
     * CONTROL[y:1..Max] = (process_Remove -> QUEUE[y-1]
                        | process_MoveToBackOfQueue -> QUEUE[y]).
	 */
	
}
