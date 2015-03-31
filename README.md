RoundRobinScheduler
===================

*A Round Robin scheduler using Java and LTSA*

System Design
-------------

Each java class implements the corresponding processes from an LTSA diagram.  All required print statements will print to the console. Collaboration and version control among group members was maintained through github and Eclipse was used to create and program the classes.

###Assumptions

* processes do not rely on each other
* total execution time of a process is limited, ie. no infinite processes
* quanta cannot be broken down into smaller units, therefore any unused time in a single quanta not used by the process running in that quanta is wasted; no other processes run during this time


Documentation
-------------

###ReadyQueue

Implements the queue. It is designed so that it is a single object and all references to the ReadyQueue class all refer to the same queue. It has methods to add processes to the end of the queue, remove and return (for execution and processing) processes if it is possible to do so (ie. the size of the queue is larger than 0), and return the size of the queue.

###Generator

Creates processes. It is called through main method in the RRScheduler, which passes in the maximum size of the queue, a random execution time is assigned to the process between the passed-in min and max values.

###Dispatcher

Sends the next process to be executed to CPU.java. The process is removed from the queue and passed on to the CPU to process. It is a thread to allow it to run concurrently with GrimReaper.

###CPU

Locks itself so that it cannot be processing more than one process at a time. This class calls the GrimReaper class to unload the process from the CPU so that it can unlock itself and continue to process the next process. 

###GrimReaper

Unloads processes and prints statement stating if the process has completed executing, or if it was added back to the queue with the remaining time. It implements threads to allow it to run concurrently with Dispatcher.

###Process
Contains the constructor for processes, instantiating id and execution time privately; getters for id and time remaining only, no setters except at process creation; execution of the process  removes a quantum from remaining execution time if the remaining time is greater than the size of quantum, otherwise the remaining time is set to zero.

###RRScheduler

Implements Dispatcher and Generator as threads so that processes can continually be created. The size of the queue, max and min execution times of processes, and quantum are set here.

The main programa
