//Multithreading is a process of executing one or more threads at same time or concurrently.
//main thread run first and then other child threads

//You can develop user define threads in two ways:
//1. By extending java.lang.Thread class
//2. By implementing java.lang.Runnable interface

/* Advantages of Multithreading:
 * 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
 * 2) You can perform many operations together, so it saves time.
 * 3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 */
package core.multithreading;

//creating two class with threads
class Thread1 extends Thread {

	// writing method
	@Override
	public void run() {
		int i = 0;
		while (i < 1000) {
			System.out.println("Thread 1 is running");
			System.out.println("Thread 1 is Best");
			i++;
		}
	}
}

//creating two class with threads
class Thread2 extends Thread {

	// writing method
	@Override
	public void run() {
		int i = 0;
		while (i < 1000) {
			System.out.println("Thread 2 is running");
			System.out.println("Thread 2 is Good");
			i++;
		}
	}
}

public class Basic {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		// start() method is default method of thread
		// start() method used for start a thread
		// start() method internally call run() method which is declared in class
		t1.start();
		t2.start();

		// sometime it running thread 1 and sometime running thread 2
		// it work concurrently not parallel

		// Concurrency: task of running and managing the multiple computation at the
		// same time.

		// Parallelism: task of running multiple computation at the same time.
	}

}

/*
 * Thread 2 is running Thread 2 is Good Thread 1 is running Thread 1 is Best
 * Thread 1 is running Thread 1 is Best Thread 1 is running Thread 1 is Best
 * Thread 1 is running
 */
