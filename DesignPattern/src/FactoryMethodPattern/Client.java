package FactoryMethodPattern;

public class Client {
	public static void main(String[] args) {
		IXeFactory factory = new XeFactory();
		Honda hd = (Honda) factory.createXe("honda");
		System.out.println(hd.getThongTin());
		
		Nexus ne = (Nexus) factory.createXe("nexus");
		System.out.println(ne.getThongTin());
		
		Toyota to = (Toyota) factory.createXe("toyota");
		System.out.println(to.getThongTin());
	}
}
