package weather.yahoo.incubation.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yahoo","admin","admin");
		if(con.isClosed()) {
			System.err.println("Unable to create a connection.");
		}
		return con;
	}
	
	/*public static void main(String...args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection().isClosed());
	}*/
	
}
