package core.multithreading;

class Stack {
	int x;

	void push(int a) {
		x = a;
	}

	int pop() {
		return x;
	}
}

//using Runnable Interface
class ThreadA implements Runnable {
	Stack st = null;

	// creating constructor of TheadA class with two parameter stack parameter and
	// thread name
	public ThreadA(Stack st, String tname) {
		Thread t = new Thread(this, tname); // first parameter is group and second thread name
		this.st = st;
		// starting thread
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			st.push(i);
			System.out.println(i + " is pushed by A");
			try {
				Thread.sleep(500); // time in millisecond
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//using Thread class
class ThreadB extends Thread {
	Stack st = null;

	// constructor
	public ThreadB(Stack st, String tname) {
		super(tname); // reference to Thread class which is parent class
		this.st = st;
//		super.start();
		start(); // static method of Thread class
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			int x = st.pop();
			System.out.println(x + " is poped by B");

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		Stack st = new Stack(); // creating new stack object

		// creating object of thread classes
		// It automatically executes because is constructor we are start the thread
		ThreadA a = new ThreadA(st, "A");
		ThreadB b = new ThreadB(st, "B");

		// this is printing of main thread
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " by " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

/*
Output:
1 is pushed by A
1 by main
1 is poped by B
2 is pushed by A
1 is poped by B
2 by main
3 is pushed by A
2 is poped by B
3 by main
4 is pushed by A
4 by main
4 is poped by B
5 by main
5 is poped by B
5 is pushed by A
*/
