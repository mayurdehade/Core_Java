//Practice Program to calculate income tax
package core.javabasic.conditionalstatements;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the income ");
		float income = s.nextFloat();

		if (income < 500000) {
			System.out.println("Tax is: 0.00");
		} else if (income >= 500000 && income <= 1000000) {
			System.out.println("Tax is: " + (income * 0.20));
		} else {
			System.out.println("Tax is: " + (income * 0.30));
		}

	}

}
