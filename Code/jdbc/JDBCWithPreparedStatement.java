//JDBC with preparedStatement
package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWithPreparedStatement {
	// database attributes
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, username, password);

			// Query
			String query = "INSERT INTO student(name, age, marks) VALUES(?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			String name = "Mayur";
			int age = 22;
			double marks = 85.99d;

			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setDouble(3, marks);

			int rowAffected = statement.executeUpdate();

			String result = (rowAffected > 0) ? "Data inserted successfully..." : "Error in query...";

			System.out.println(result);

			// ****************** Retrieve Operation *****************
			String query2 = "SELECT * FROM student";
			PreparedStatement statement2 = connection.prepareStatement(query2);

			ResultSet rs = statement2.executeQuery();
			while (rs.next()) {
				int id2 = rs.getInt("id");
				String name2 = rs.getString("name");
				int age2 = rs.getInt("age");
				double marks2 = rs.getDouble("marks");
				System.out.println(id2 + " " + name2 + " " + age2 + " " + marks2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
