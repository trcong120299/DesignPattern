package bai1_factory;

public class Client {
	public static void main(String[] args) {
		
		IXeFactory factory = new XeFactory();
		Xe hd = factory.createXe("honda");
		System.out.println(hd.getThongtin());
		
		Xe t = factory.createXe("toyota");
		System.out.println(t.getThongtin());
		
		Xe n = factory.createXe("nexus");
		System.out.println(n.getThongtin());
	}
}
