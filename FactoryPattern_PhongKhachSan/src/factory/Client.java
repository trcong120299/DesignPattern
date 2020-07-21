package factory;

public class Client {
	public static void main(String[] args) {
		IPhongFactory iPhong = new PhongFactory();
		
		Phong p1 = iPhong.taoPhong(1);
		System.out.println(p1.getThongTinPhong());
		
		Phong p2 = iPhong.taoPhong(2);
		System.out.println(p2.getThongTinPhong());
	}
}
