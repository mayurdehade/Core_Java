//Program to demonstrate the break statement
//Primarily used to terminate the loop or switch statement in which it is present.
//As soon as the break statement is encountered within a loop, the loop is immediately terminated.
package core.javabasic.controlstatements;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			if(i==3)
				break;
			System.out.println(i);
			//Print the number 1,2 the the execution is stop
		}
		
		System.out.println("Outer Statement");
	}

}
