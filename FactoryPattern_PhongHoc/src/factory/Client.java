package factory;

public class Client {
	public static void main(String[] args) {
		IPhongHoc iPhong = new PhongHocFactory();
		
		PhongHoc p1 = iPhong.taoPhong("lý thuyết");
		p1.getPhong();
		
		PhongHoc p2 = iPhong.taoPhong("thí nghiệm");
		p2.getPhong();
	}
}
