package NoiThatAbstract;

public class Client {
	public static void main(String[] args) {
		INoiThat factory = new NhuaFactory();
		AbstractNoiThat bg = factory.createBan();
		System.out.println(bg.getThongTin());
	}
}
