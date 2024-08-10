//jdbc insert operation
package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertOperation {
	
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
			//establish connection
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			//insert query
			//for updation and insertion use executeUpdate();
			String insertQuery = String.format("INSERT INTO student(name, age, marks) VALUES ('%s', %d, %f)", "Maddy", 25, 80.3);

			//execute update return integer values of how many rows affected
			
			int rowAffected = statement.executeUpdate(insertQuery);
			
			if(rowAffected!=0) {
				System.out.println("Data inserted");
			} else {
				System.out.println("Error! Data not inserted...");
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
