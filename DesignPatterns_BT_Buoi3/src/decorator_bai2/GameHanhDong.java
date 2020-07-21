package decorator_bai2;

public class GameHanhDong extends Game implements IGame{
	private String kieu;

	public String getKieu() {
		return kieu;
	}

	public void setKieu(String kieu) {
		this.kieu = kieu;
	}

	public GameHanhDong(String ten, String theLoai, String kieu) {
		super(ten, theLoai);
		this.kieu = kieu;
	}

	public GameHanhDong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameHanhDong(String ten, String theLoai) {
		super(ten, theLoai);
		// TODO Auto-generated constructor stub
	}
	
}
