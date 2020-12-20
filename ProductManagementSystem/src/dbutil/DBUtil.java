package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?serverTimezone=UTC";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "";

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
