package db_test;

public class FindTest {
	public static void main(String[] args) throws Exception {

		ProductManager pm = new ProductManager();
		Product product = pm.find(3);
		
		
		if(product != null) {
			System.out.println("Kayıt bulundu!");
		    System.out.println("Ürün Özdeşliği: " + product.getProductId());
	        System.out.println("Ürün Adı: " + product.getProductName());
	        System.out.println("Satış Ederi: " + product.getSalesPrice());
		}else {
			System.out.println("Kayıt bulunamadı!");
		}
		
	}

}
