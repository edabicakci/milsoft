package db_test;

public class DeleteTest {
	public static void main(String[] args) throws Exception {

		ProductManager pm = new ProductManager();
		if(pm.delete(2)) {
			System.out.println("Silme işlemi başarılı!");
		}else {
			System.out.println("Kayıt silinemedi!");
		}
	}

}
