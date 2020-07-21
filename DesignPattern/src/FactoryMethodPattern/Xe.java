package FactoryMethodPattern;

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
	
	public abstract String getThongTin();
	
	public Xe(String tenxe, String cauhinhxe, String tenhang, String thongtinkythuat) {
		super();
		this.tenxe = tenxe;
		this.cauhinhxe = cauhinhxe;
		this.tenhang = tenhang;
		this.thongtinkythuat = thongtinkythuat;
	}
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Xe [tenxe=" + tenxe + ", cauhinhxe=" + cauhinhxe + ", tenhang=" + tenhang + ", thongtinkythuat="
				+ thongtinkythuat + "]";
	}
	
	
}	
