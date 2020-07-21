package absFactory;

public class Client {
	public static void main(String[] args) {
		IMatHang factory = new MatHangAnh();
		AbsMatHang abs = factory.createGiayDep();
		abs.getThongTin();
	}
}
