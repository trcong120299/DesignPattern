package bridge_bai2;

public class Client {
	public static void main(String[] args) {
		AbstractFactory goFactory= new GoFactory();
		AbstractFactory nhuaFactory= new NhuaFactory();
		NoiThat n= nhuaFactory.createBan();
		n.setMaSo("1");
		n.setDonGia(10f);
		System.out.println(n.getThongTin());
		NoiThat n1= goFactory.createGhe();
		n1.setMaSo("1");
		n1.setDonGia(10f);
		System.out.println(n1.getThongTin());
		
	}
}
