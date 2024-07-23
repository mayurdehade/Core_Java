//Program to demonstrate the logical operators
package core.javabasic.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		//logical and operator 
		//(true && true == true) otherwise false
		System.out.println(a && b);
		
		//logical or operator
		//(false || false == false) otherwise true
		System.out.println(a || b);
		
		//logical not operator
		System.out.println(!a);
	}

}
