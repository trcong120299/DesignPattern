package XeFactory;

public class Client {
	public static void main(String[] args) {
		IXeFactory factory = new XeFactory();
		
		Xe x1 = factory.createXe("honda");
		System.out.println(x1.getThongTin());
		
		Xe x2 = factory.createXe("toyota");
		System.out.println(x2.getThongTin());
		
		Xe x3 = factory.createXe("nexus");
		System.out.println(x3.getThongTin());
	}
}
