package db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteTest {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/new_schema";
		String user = "root";
		String password = "";
		String driver= "com.mysql.cj.jdbc.Driver";
		Class.forName(driver).newInstance();
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String sql = """
				insert into Product(productName, salesPrice) values(? ,?)
				
				""";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Masaüstü Bilgisayar");
		statement.setDouble(2, 678);
		int affected = statement.executeUpdate();
		
		//System.out.println(connection.getMetaData().getDatabaseProductName());
		System.out.println("Etkilenen: " + affected);
		connection.close();
		
		
		
	}
	
	

}
