# Multi-Threading
![alt text](https://www.tutorialspoint.com/java/images/Thread_Life_Cycle.jpg)
## How to create thread

There are two ways to create a thread:

- By extending Thread class
- By implementing Runnable interface.

### Commonly used methods of Thread class:
- **public void run():** is used to perform action for a thread.
- **public void start():** starts the execution of the thread.JVM calls the run() method on the thread.
- **public void sleep(long miliseconds):** Causes the currently executing thread to sleep (temporarily cease execution) for the     specified number of milliseconds.
- **public void resume():** is used to resume the suspended thread(depricated).
- **public void stop():** is used to stop the thread(depricated).

**Runnable interface:**
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().
public void run(): is used to perform action for a thread.

**Starting a thread:**
start() method of Thread class is used to start a newly created thread. It performs following tasks:
- A new thread starts(with new callstack).
- The thread moves from New state to the Runnable state.
- When the thread gets a chance to execute, its target run() method will run.
