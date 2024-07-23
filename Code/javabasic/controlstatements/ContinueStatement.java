//Program to demonstrate the continue statement
package core.javabasic.controlstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			if(i==3) //3 is skip
				continue; 
			//here 3 will not display
			//if the condition is true then statement after continue statement not execute
			System.out.println(i);
		}
		System.out.println("Outer Statement");
	}

}
