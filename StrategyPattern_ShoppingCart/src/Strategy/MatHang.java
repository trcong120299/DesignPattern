package Strategy;

public class MatHang {
	private String mahang;
	private String tenhang;
	private double dongia;
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public MatHang(String mahang, String tenhang, double dongia) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
	}
	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MatHang [mahang=" + mahang + ", tenhang=" + tenhang + ", dongia=" + dongia + "]";
	}
}
