package db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class ProductManager {

	public boolean insert(Product product) throws Exception {

		Connection connection = null;
		try {
			connection = openConnection();

			String sql = """
					insert into Product(productName, salesPrice) values(?,?)

					""";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, product.getProductName());
			statement.setDouble(2, product.getSalesPrice());
			int affected = statement.executeUpdate();

			// System.out.println(connection.getMetaData().getDatabaseProductName());
			if (affected == 1) {
				connection.close();
				return true;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			connection.close();
		}

		return false;

	}

	public boolean update(Product product) throws Exception {
		Connection connection = null;

		try {
			connection = openConnection();
			String sql = " update Product set productName = " + "'" + product.getProductName() + "'" + ", salesPrice= "
					+ product.getSalesPrice() + " where productId = " + product.getProductId();
			PreparedStatement statement = connection.prepareStatement(sql);
			int affected = statement.executeUpdate(sql);

			if (affected == 1) {
				connection.close();
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			connection.close();
		}

		return false;

	}

	public boolean delete(long productId) throws Exception {

		Connection connection = null;

		try {
			connection = openConnection();

			String sql = """
					delete from Product where productId= """ + productId;

			PreparedStatement statement = connection.prepareStatement(sql);
			int affected = statement.executeUpdate(sql);

			if (affected == 1) {
				connection.close();
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			connection.close();
		}

		return false;

	}

	public Product find(long productId) throws Exception {

		Connection connection = null;
		Product product = new Product();

		try {

			connection = openConnection();
			String sql = """
					select productName, salesPrice from Product where productId= """ + productId;

			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {
				String productName = set.getString("productName");
				Double salesPrice = set.getDouble("salesPrice");
				
				product.setProductId(productId);
				product.setProductName(productName);
				product.setSalesPrice(salesPrice);

			}

			return product;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return null;

	}

	public List<Product> findAll() throws Exception {

		List<Product> productList = new ArrayList<Product>();
		Connection connection = null;

		try {
			connection = openConnection();
			String sql = """
					select * from Product
					""";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {

				Product product = new Product();

				Long productId = set.getLong("productId");
				String name = set.getString("productName");
				Double price = set.getDouble("salesPrice");

				product.setProductId(productId);
				product.setProductName(name);
				product.setSalesPrice(price);

				productList.add(product);

			}

			return productList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return null;

	}

	private Connection openConnection() throws Exception {

		String url = "jdbc:mysql://localhost/new_schema";
		String user = "root";
		String password = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver).newInstance();

		return DriverManager.getConnection(url, user, password);

	}

}
