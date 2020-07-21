package decorator;

public class GiangVien {
	private String magv;
	
	private String hoten;
	
	private IChucNang chucnang;

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public IChucNang getChucnang() {
		return chucnang;
	}

	public void setChucnang(IChucNang chucnang) {
		this.chucnang = chucnang;
	}

	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiangVien(String magv, String hoten, IChucNang chucnang) {
		super();
		this.magv = magv;
		this.hoten = hoten;
		this.chucnang = chucnang;
	}

	@Override
	public String toString() {
		return "GiangVien [magv=" + magv + ", hoten=" + hoten + ", chucnang=" + chucnang + "]";
	}
	
	
}
