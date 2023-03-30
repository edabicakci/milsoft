package db_test;

public class UpdateTest {
	public static void main(String[] args) throws Exception{
		
		ProductManager pm = new ProductManager();
		Product product = new Product(1, "Yeni Telefon", 234.7);
		

		if(pm.update(product)) {
			System.out.println("Güncelleme işlemi başarılı!");
		}else {
			System.out.println("Güncelleme yapılamadı!");
		}
		
	}	

}
