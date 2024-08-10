//JDBC Basics
//JDBC with createStatement
package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCBasic {

	// Database attributes
	// private for security
	// static for accessing without object (Global Scope)
	// final for constant (modification not allowed)
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {

		// load drivers
		try {
			// Load external drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			// create connection
			// get connection method connect to database and it is in DriverManager class
			// it required three arguments url, username, password
			Connection connection = DriverManager.getConnection(url, username, password);

			//create statement (it available at connection interface)
			Statement statement = connection.createStatement();
			
			//create query
			String query = "SELECT * FROM student";
			
			//executing query and storing data into result set
			//for retrieve use executeQuery()
			//ResultSet interface stores data retrieved from database
			ResultSet rs = statement.executeQuery(query);
			
			
			//print data
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double marks = rs.getDouble("marks");
				
				System.out.println(id+"\t"+name+"\t"+age+"\t"+marks);
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
