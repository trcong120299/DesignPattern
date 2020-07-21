package bai3_abstract_factory;

public abstract class SanPham {
	protected String maSP;
	protected String tenSP;
	protected double giaCa;
	public abstract String getThongTin();
	public String getMaSP() {
		return maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public double getGiaCa() {
		return giaCa;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}
	public SanPham(String maSP, String tenSP, double giaCa) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaCa = giaCa;
	}
	public SanPham() {
		super();
		
	}
}
