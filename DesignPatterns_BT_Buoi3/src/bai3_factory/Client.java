package bai3_factory;

public class Client {
	public static void main(String[] args) {
		IFactory factory= new Factory();
		Phong p= factory.createPhong("1");
		p.setSoPhong(1);
		System.out.println(p);
	}
}
