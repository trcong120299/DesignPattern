package bridge;

public class Client {
	public static void main(String[] args) {
		NoiThat ban = new Ban(new Go());
		ban.getThongTin();
		
		NoiThat ghe = new Ghe(new Nhua());
		ghe.getThongTin();
	}
}
