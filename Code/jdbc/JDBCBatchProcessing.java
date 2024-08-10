//Batch Operation using create statement

package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBatchProcessing {

	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {
		try {
			// load driver (external driver -> jar file)
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			// create connection
			Connection connection = DriverManager.getConnection(url, username, password);

			// create statement
			Statement statement = connection.createStatement();

			// Create object of scanner class
			Scanner sc = new Scanner(System.in);

			//get multiple input from user
			while (true) {
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				System.out.println("Enter marks: ");
				double marks = sc.nextDouble();

				String query = String.format("INSERT INTO student(name, age, marks) VALUES('%s',%d, %f)", name, age,
						marks);

				// add statement into batch
				// add to batch
				statement.addBatch(query);

				System.out.println("Want to enter more data Y/N: ");
				String choice = sc.next().toUpperCase();
				if (choice.equals("N"))
					break;
			}

			// execute all queries added in batch
			// it will return array of integer which represent how many row affected at each
			// execution
			int rowsAffected[] = statement.executeBatch();
			for (int i = 0; i < rowsAffected.length; i++) {
				if (rowsAffected[i] == 0)
					System.out.println("Query " + (i + 1) + "th query not executed!");
				else
					System.out.println("Query " + (i + 1) + "th query executed successfully!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
