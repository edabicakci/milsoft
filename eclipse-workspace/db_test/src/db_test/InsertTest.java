package db_test;

public class InsertTest {
	public static void main(String[] args) throws Exception {
		ProductManager pm = new ProductManager();
		Product product = new Product();
		product.setProductName("buzdolabı");
		product.setSalesPrice(345.8);
	
		if(pm.insert(product)) {
			System.out.println("Ekleme işlemi başarılı!");
		}else {
			System.out.println("Kayıt kaydedilemedi!");
		}
	}
}
