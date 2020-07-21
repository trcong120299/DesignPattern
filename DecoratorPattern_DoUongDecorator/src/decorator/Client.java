package decorator;

public class Client {
	public static void main(String[] args) {
		IThucuong mon = new Tra();
		mon = new Sua(mon);
		mon = new Tranchau(mon);
		
		System.out.println("Mô tả: " + mon.getMota());
		System.out.println("Giá: " + mon.getDongia());
		
		IThucuong mon2 = new Cafe();
		mon2 = new Sua(mon2);
		mon2 = new Tranchau(mon2);
		
		System.out.println("Mô tả: " + mon2.getMota());
		System.out.println("Giá: " + mon2.getDongia());
	}
}
