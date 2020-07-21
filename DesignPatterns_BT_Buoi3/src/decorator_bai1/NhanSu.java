package decorator_bai1;

public abstract class NhanSu {
	protected String ma;
	protected String ten;
	protected String sdt;
	protected String diaChi;
	public String getMa() {
		return ma;
	}
	public String getTen() {
		return ten;
	}
	public String getSdt() {
		return sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public NhanSu(String ma, String ten, String sdt, String diaChi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	public NhanSu() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
