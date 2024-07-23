//Program to demonstrate the assignment operators +=, -+, *=, /=, %=
package core.javabasic.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 28;
		
		//it work like num1 = num1 + num2;
		num1 += num2;
		System.out.println(num1); //30
		
		//it work like num2 = num2 - num1
		num2 -= num1;
		System.out.println(num2); //-2
	}

}
