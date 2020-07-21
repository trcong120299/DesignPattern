package facade;

public class Client {
	public static void main(String[] args) {
		ShopFacade facade= new ShopFacade();
		System.out.println("Thanh toán trực tiếp\n");
		facade.thanhToanTrucTiep("ha@gmail.com");
		System.out.println("\nThanh toán online\n");
		facade.thanhToanOnline("ha@gmail.com", "0123456789");
	}
}
