package bai2_factory;

public class Client {
	public static void main(String[] args) {
		Factory factory= new Factory();
		Command c= factory.createCommand("list");
		c.setMa(1);
		c.setLoai("Danh sach");
		System.out.println(c);
	}
}
