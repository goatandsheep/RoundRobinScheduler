Tests
=====

Test Case 1
---------------------------------------------------------------

###Input

* maxQ = 10
* minExcT = 1
* maxExcT = 10
* quantum = 7

###Expected Output

Generator will generate processes while dispatcher tries to load them to the CPU to be executed and then processed by grimreaper. There will be no more than 10 processes in the queue. Some processes will require longer than quantum to finish executing thus grimreaper will add them back to the queue.

###Actual Output

- Generator: Process 1 loaded into ready queue.
- Generator: Process 2 loaded into ready queue.
- Dispatcher: Process 1 loaded into CPU.
- Generator: Process 3 loaded into ready queue.
- CPU: Process 1 executed for 7.0 seconds.
- Reaper: Process 1 recycled into ready queue with 1.0 second(s) remaining.
- Generator: Process 4 loaded into ready queue.
- Generator: Process 5 loaded into ready queue.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 7.0 seconds.
- Reaper: Process 2 recycled into ready queue with 1.0 second(s) remaining.
- Generator: Process 6 loaded into ready queue.
- Generator: Process 7 loaded into ready queue.
- Dispatcher: Process 3 loaded into CPU.
- CPU: Process 3 executed for 6.0 seconds.
- Reaper: Process 3 finished executing.
- Generator: Process 8 loaded into ready queue.
- Generator: Process 9 loaded into ready queue.
- Dispatcher: Process 1 loaded into CPU.
- CPU: Process 1 executed for 1.0 seconds.
- Reaper: Process 1 finished executing.
- Generator: Process 10 loaded into ready queue.
- Generator: Process 11 loaded into ready queue.
- Dispatcher: Process 4 loaded into CPU.
- CPU: Process 4 executed for 7.0 seconds.
- Reaper: Process 4 finished executing.
- Generator: Process 12 loaded into ready queue.
- Generator: Process 13 loaded into ready queue.
- Dispatcher: Process 5 loaded into CPU.
- CPU: Process 5 executed for 7.0 seconds.
- Reaper: Process 5 finished executing.
- Generator: Process 14 loaded into ready queue.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 1.0 seconds.
- Reaper: Process 2 finished executing.
- Generator: Process 15 loaded into ready queue.
- Dispatcher: Process 6 loaded into CPU.
- CPU: Process 6 executed for 2.0 seconds.
- Reaper: Process 6 finished executing.

Test Case 2
-----------

###Input

* maxQ = 20
* minExcT = 1
* maxExcT = 10
* quantum = 5

###Expected Output

Generator will generate processes while dispatcher tries to load them to the CPU to be executed and then processed by grimreaper. There will be no more than 20 processes in the queue. Some processes will require longer than quantum to finish executing thus grimreaper will add them back to the queue. (Approximately double the processes should need to be added back to the queue.)

###Actual Output:

- Generator: Process 1 loaded into ready queue.
- Generator: Process 2 loaded into ready queue.
- Dispatcher: Process 1 loaded into CPU.
- Generator: Process 3 loaded into ready queue.
- CPU: Process 1 executed for 5.0 seconds.
- Reaper: Process 1 finished executing.
- Generator: Process 4 loaded into ready queue.
- Generator: Process 5 loaded into ready queue.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 5.0 seconds.
- Reaper: Process 2 recycled into ready queue with 1.0 second(s) remaining.
- Generator: Process 6 loaded into ready queue.
- Generator: Process 7 loaded into ready queue.
- Dispatcher: Process 3 loaded into CPU.
- CPU: Process 3 executed for 5.0 seconds.
- Reaper: Process 3 recycled into ready queue with 2.0 second(s) remaining.
- Generator: Process 8 loaded into ready queue.
- Dispatcher: Process 4 loaded into CPU.
- Generator: Process 9 loaded into ready queue.
- CPU: Process 4 executed for 5.0 seconds.
- Reaper: Process 4 recycled into ready queue with 2.0 second(s) remaining.
- Generator: Process 10 loaded into ready queue.
- Generator: Process 11 loaded into ready queue.
- Dispatcher: Process 5 loaded into CPU.
- CPU: Process 5 executed for 5.0 seconds.
- Reaper: Process 5 finished executing.
- Generator: Process 12 loaded into ready queue.
- Dispatcher: Process 2 loaded into CPU.
- Generator: Process 13 loaded into ready queue.
- CPU: Process 2 executed for 1.0 seconds.
- Reaper: Process 2 finished executing.
- Generator: Process 14 loaded into ready queue.
- Generator: Process 15 loaded into ready queue.
- Dispatcher: Process 6 loaded into CPU.
- CPU: Process 6 executed for 5.0 seconds.
- Reaper: Process 6 recycled into ready queue with 4.0 second(s) remaining.
- Generator: Process 16 loaded into ready queue.
- Generator: Process 17 loaded into ready queue.
- Dispatcher: Process 7 loaded into CPU.
- CPU: Process 7 executed for 3.0 seconds.
- Reaper: Process 7 finished executing.
- Generator: Process 18 loaded into ready queue.
- Generator: Process 19 loaded into ready queue.

Test Case 3
-----------

* maxQ = 1
* minExcT = 1
* maxExcT = 10
* quantum = 7

###Expected Output

Generator will generate processes while dispatcher tries to load them to the CPU to be executed and then processed by grimreaper. There will be no more than 1 process in the queue. Some processes will require longer than quantum to finish executing thus grimreaper will add them back to the queue. Since the max queue size is 1, any process added back to the queue will be processed immediately. 

###Actual Output

- Generator: Process 1 loaded into ready queue.
- Dispatcher: Process 1 loaded into CPU.
- Generator: Process 2 loaded into ready queue.
- CPU: Process 1 executed for 5.0 seconds.
- Reaper: Process 1 finished executing.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 7.0 seconds.
- Reaper: Process 2 recycled into ready queue with 2.0 second(s) remaining.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 2.0 seconds.
- Reaper: Process 2 finished executing.
- Generator: Process 3 loaded into ready queue.
- Dispatcher: Process 3 loaded into CPU.
- CPU: Process 3 executed for 7.0 seconds.
- Reaper: Process 3 recycled into ready queue with 1.0 second(s) remaining.
- Dispatcher: Process 3 loaded into CPU.
- CPU: Process 3 executed for 1.0 seconds.
- Reaper: Process 3 finished executing.
- Generator: Process 4 loaded into ready queue.
- Dispatcher: Process 4 loaded into CPU.
- CPU: Process 4 executed for 7.0 seconds.
- Reaper: Process 4 recycled into ready queue with 2.0 second(s) remaining.
- Dispatcher: Process 4 loaded into CPU.
- CPU: Process 4 executed for 2.0 seconds.
- Reaper: Process 4 finished executing.
- Generator: Process 5 loaded into ready queue.
- Dispatcher: Process 5 loaded into CPU.
- CPU: Process 5 executed for 7.0 seconds.
- Reaper: Process 5 recycled into ready queue with 1.0 second(s) remaining.
- Dispatcher: Process 5 loaded into CPU.
- CPU: Process 5 executed for 1.0 seconds.
- Reaper: Process 5 finished executing.
- Generator: Process 6 loaded into ready queue.
- Dispatcher: Process 6 loaded into CPU.
- CPU: Process 6 executed for 5.0 seconds.
- Reaper: Process 6 finished executing.
- Generator: Process 7 loaded into ready queue.
- Dispatcher: Process 7 loaded into CPU.
- CPU: Process 7 executed for 2.0 seconds.
- Reaper: Process 7 finished executing.


Test Case 4
-----------

###Input

* maxQ = 1
* minExcT = 1
* maxExcT = 10
* quantum = 10

###Expected Output

Generator will generate processes while dispatcher tries to load them to the CPU to be executed and then processed by grimreaper. There will be no more than 1 process in the queue. No process will require longer than quantum to finish executing thus grimreaper will not add any process to the back of the queue. 

###Actual Output

- Generator: Process 1 loaded into ready queue.
- Dispatcher: Process 1 loaded into CPU.
- Generator: Process 2 loaded into ready queue.
- CPU: Process 1 executed for 4.0 seconds.
- Reaper: Process 1 finished executing.
- Dispatcher: Process 2 loaded into CPU.
- CPU: Process 2 executed for 7.0 seconds.
- Reaper: Process 2 finished executing.
- Generator: Process 3 loaded into ready queue.
- Dispatcher: Process 3 loaded into CPU.
- CPU: Process 3 executed for 6.0 seconds.
- Reaper: Process 3 finished executing.
- Generator: Process 4 loaded into ready queue.
- Dispatcher: Process 4 loaded into CPU.
- CPU: Process 4 executed for 7.0 seconds.
- Reaper: Process 4 finished executing.
- Generator: Process 5 loaded into ready queue.
- Dispatcher: Process 5 loaded into CPU.
- CPU: Process 5 executed for 2.0 seconds.
- Reaper: Process 5 finished executing.
- Generator: Process 6 loaded into ready queue.
- Dispatcher: Process 6 loaded into CPU.
- CPU: Process 6 executed for 6.0 seconds.
- Reaper: Process 6 finished executing.
- Generator: Process 7 loaded into ready queue.
- Dispatcher: Process 7 loaded into CPU.
- CPU: Process 7 executed for 9.0 seconds.
- Reaper: Process 7 finished executing.
- Generator: Process 8 loaded into ready queue.
- Dispatcher: Process 8 loaded into CPU.
- CPU: Process 8 executed for 3.0 seconds.
- Reaper: Process 8 finished executing.
- Generator: Process 9 loaded into ready queue.
- Dispatcher: Process 9 loaded into CPU.
- CPU: Process 9 executed for 5.0 seconds.
- Reaper: Process 9 finished executing.
- Generator: Process 10 loaded into ready queue.
- Dispatcher: Process 10 loaded into CPU.
- CPU: Process 10 executed for 7.0 seconds.
- Reaper: Process 10 finished executing.

