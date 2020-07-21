package brige;

public class Client {
	public static void main(String[] args) {
		Ve hcn = new HCN();
		HienThi h = new Windows("Windows", hcn);
		System.out.println(h.show());
		HienThi h1 = new Windows("Windows", new HinhTron());
		System.out.println(h1.show());
		HienThi h2 = new MacOS("MacOs", new HCN());
		System.out.println(h2.show());
	}
}
