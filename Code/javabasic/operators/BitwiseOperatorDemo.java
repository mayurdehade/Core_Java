//Program to demonstrate the Bitwise Operator
//Bitwise operator are used to performing the manipulation of individual bits of a number.
//They can be used with any integral type (char, short, int etc.)
package core.javabasic.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int a = 5; // In Binary 0101
		int b = 7; // In Binary 0111
		int c = 1;

		// Bitwise and
		System.out.println(a & b); // 5
		// 0101 0111 --------- 0101 = 5 (In decimal)

		// Bitwise OR
		System.out.println(a | b); // 7
		/*
		 * 0101 0111 ------------ 0111 = 7 (In decimal)
		 */

		// Bitwise XOR
		System.out.println(a ^ b); // xor -> 2
		/*
		 * 0101 0111 --------- 0010 = 2 (In decimal)
		 */

		// Bitwise Complement (~) -> Unary operator
		// It return 1's complement
		System.out.println(~a); // 10 (In binary 1010)

		// Right shift operator
		System.out.println(a >> c); // 2

		// Left shift operator
		System.out.println(a << c); // 10
	}

}
