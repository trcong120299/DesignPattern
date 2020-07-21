package decorator_bai2;

public abstract class Game {
	protected String ten;
	protected String theLoai;
	public String getTen() {
		return ten;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public Game(String ten, String theLoai) {
		super();
		this.ten = ten;
		this.theLoai = theLoai;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
