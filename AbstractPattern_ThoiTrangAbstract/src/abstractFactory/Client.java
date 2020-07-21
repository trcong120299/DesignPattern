package abstractFactory;

public class Client {
	public static void main(String[] args) {
		IMatHang iMatHang = new AnhFactory();
		AbsMatHang absMatHang = iMatHang.createQuanAo();
		System.out.println(absMatHang.getThongTin());
	}
}
