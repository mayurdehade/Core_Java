//Nested Try Catch
package core.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks[] = new int[3];
		marks[0] = 29;
		marks[1] = 20;
		marks[2] = 94;

		boolean flag = true;

		while (flag) {
			System.out.println("Enter the index value: ");
			int index = sc.nextInt();

			try {
				System.out.println("First try block...");
				// Nested try
				try {
					System.out.println(marks[index]);
					flag = false;
				} catch (Exception e) {
					System.out.println("Sorry this index does not exists");
					System.out.println("Exception level 2");
				}
			} catch (Exception e) {
				System.out.println("Exception level 1");
			}
		}
		System.out.println("End...");
	}

}
