package db_test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost/new_schema";
		String user = "root";
		String password = "";
		String driver= "com.mysql.cj.jdbc.Driver";
		Class.forName(driver).newInstance();
		
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println(connection.getMetaData().getDatabaseProductName());
		System.out.println("Hello");
		
		connection.close();
		
		
		
	}

}
