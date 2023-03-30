package db_test;

import java.util.List;

public class FindAllTest {
	public static void main(String[] args) throws Exception {

		ProductManager pm = new ProductManager();
		
		List <Product> productList = pm.findAll();
		
		for(Product product: productList) {
			System.out.println("Ürün Özdeşliği: " + product.getProductId());
	        System.out.println("Ürün Adı: " + product.getProductName());
	        System.out.println("Satış Ederi: " + product.getSalesPrice());
				
		}
	}

}
