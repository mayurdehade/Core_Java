//JDBC Batch Processing with PreparedStatement
package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBatchProcessing2 {

	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String pass = "mayur";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		try {
			Connection connection = DriverManager.getConnection(url, username, pass);

			// Query
			String query = "INSERT INTO student(name, age, marks) VALUES(?, ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			while (true) {
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				System.out.println("Enter marks: ");
				double marks = sc.nextDouble();

				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, age);
				preparedStatement.setDouble(3, marks);

				preparedStatement.addBatch();

				System.out.println("Want to enter more data??? (Y/N): ");
				String choice = sc.next().toUpperCase();
				if (choice.equals("N"))
					break;
			}

			int result[] = preparedStatement.executeBatch();
			for (int i = 0; i < result.length; i++) {
				if (result[i] == 0)
					System.out.println("Query " + (i + 1) + "th not executed!!!");
				else
					System.out.println("Query " + (i + 1) + "th executed successfully!");

			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}