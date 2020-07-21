package bridge_bai2;

public abstract class NoiThat {
	protected String maSo;
	protected double donGia;
	protected VatLieu vatLieu;
	public String getMaSo() {
		return maSo;
	}
	public double getDonGia() {
		return donGia;
	}
	public VatLieu getVatLieu() {
		return vatLieu;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setVatLieu(VatLieu vatLieu) {
		this.vatLieu = vatLieu;
	}
	
	public NoiThat(VatLieu vatLieu) {
		super();
		this.vatLieu = vatLieu;
	}
	public NoiThat(String maSo, double donGia, VatLieu vatLieu) {
		super();
		this.maSo = maSo;
		this.donGia = donGia;
		this.vatLieu = vatLieu;
	}
	public NoiThat() {
		super();
	}
	public abstract String getThongTin();
}
