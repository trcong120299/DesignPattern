package bai2_abstract_factory;

public class Client {
	public static void main(String[] args) {
//		INoithatFactory factory = new NhuaFactory();
//		AbstractNoithat bn =  factory.createBan();
//		AbstractNoithat gn = factory.createGhe();
//	
//		System.out.println(bn.getThongtin());
//		System.out.println(gn.getThongtin());
		
		INoithatFactory factory2= new GoFactory();
		AbstractNoithat bg = factory2.createBan();
		((Ban)bg).setDai(20);
		((Ban)bg).setRong(10);
		System.out.println(bg.getThongtin());
		
	}
}
