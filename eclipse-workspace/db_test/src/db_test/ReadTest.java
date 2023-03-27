package db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadTest {
	
public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost/new_schema";
		String user = "root";
		String password = "";
		String driver= "com.mysql.cj.jdbc.Driver";
		Class.forName(driver).newInstance();
		
		Connection connection = DriverManager.getConnection(url,user,password);
		//System.out.println(connection.getMetaData().getDatabaseProductName());
		
		String sql = "select * from product";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			
			long productId = resultSet.getLong("productId");
			String productName = resultSet.getString("productName");
			double salesPrice = resultSet.getDouble("salesPrice");
			
			System.out.println(productId + " " + productName + " " + salesPrice);
			
			
		}
		
		connection.close();
		
		
	}


}
