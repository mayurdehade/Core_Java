package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	//database attributes
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {

		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			// get connection
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();

			// query
			String deleteQuery = "DELETE FROM student WHERE id=120";

			//execute query
			int rowaffected = statement.executeUpdate(deleteQuery);

			//result
			String result = (rowaffected > 0) ? "Deleted successfully..." : "Error...";

			//print result
			System.out.println(result);
			
			
		} catch (SQLException e) {
			//it throw SQLException
			System.out.println(e.getMessage());
		}

	}

}
