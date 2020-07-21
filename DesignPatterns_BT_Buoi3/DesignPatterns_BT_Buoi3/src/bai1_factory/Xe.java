package bai1_factory;

public abstract class Xe {
	
	private String tenxe;
	private String cauhinhxe;
	private String tenhang;
	private String thongtinkythuat;
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public String getCauhinhxe() {
		return cauhinhxe;
	}
	public void setCauhinhxe(String cauhinhxe) {
		this.cauhinhxe = cauhinhxe;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public String getThongtinkythuat() {
		return thongtinkythuat;
	}
	public void setThongtinkythuat(String thongtinkythuat) {
		this.thongtinkythuat = thongtinkythuat;
	}
	
	public abstract String getThongtin();
	
}
