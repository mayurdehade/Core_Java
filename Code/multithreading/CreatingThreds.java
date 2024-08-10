//Creating threads using Thread class
//Thread is light-weight process, smallest unit of processing.

package core.multithreading;

public class CreatingThreds {

	public static void main(String[] args) {
		System.out.println("main method begin");

		// currentThread() method
		// returns a reference to the currently executing thread object.
		Thread t = Thread.currentThread();

		System.out.println(t); // Thread[#1,main,5,main]
		System.out.println(t.getName()); // main thread
		System.out.println(t.getPriority()); // 5

		// set name to t thread
		t.setName("First Thread");

		// set priority of thread -> high priority thread will execute first
		// min priority is 1
		// max priority is 10
		// normal priority is 5
		t.setPriority(10);

		System.out.println(t); // Thread[#1,First Thread,5,main]

		System.out.println(t.getName());
	}

}
