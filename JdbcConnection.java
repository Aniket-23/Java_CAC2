package ecommerce;
import java.sql.*;

public class JdbcConnection

{

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/swing_demo";
	static final String USER = "root";
	static final String PASS = "aniket";


	public static void main(String[] args)
	{
		Statement stmt = null;

		try
		{
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root", "aniket");
			System.out.println("Connected database successfully");
			System.out.println("Creating table in database");
			stmt = conn.createStatement();


			String sql = "create table Login(username varchar(15),password varchar(5))";

			stmt.executeUpdate(sql);

		}
		
		catch (SQLException se)
		{
			se.printStackTrace();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

		finally
		{}

	}

}
