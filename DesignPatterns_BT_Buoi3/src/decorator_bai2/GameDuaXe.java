package decorator_bai2;

public class GameDuaXe extends Game implements IGame{
	private String loaiHinh;

	public String getLoaiHinh() {
		return loaiHinh;
	}

	public void setLoaiHinh(String loaiHinh) {
		this.loaiHinh = loaiHinh;
	}

	public GameDuaXe(String ten, String theLoai, String loaiHinh) {
		super(ten, theLoai);
		this.loaiHinh = loaiHinh;
	}

	public GameDuaXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameDuaXe(String ten, String theLoai) {
		super(ten, theLoai);
		// TODO Auto-generated constructor stub
	}
	
}
