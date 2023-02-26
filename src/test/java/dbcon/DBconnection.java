package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection connectDb() throws ClassNotFoundException, SQLException {
		Connection con =null;
		try {
	        // Load the JDBC driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        // Establish a database connection
	        String con_string = "jdbc:mysql://localhost:3306/employeeDatabase";
	        con = DriverManager.getConnection(con_string, "root", "");

	    } catch (ClassNotFoundException e) {
	        // Handle driver loading error
	        e.printStackTrace();
	        throw e;
	    } catch (SQLException e) {
	        // Handle connection error
	        e.printStackTrace();
	        throw e;
	    }
		return con;		
	}

}
