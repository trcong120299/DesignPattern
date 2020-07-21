package XeFactory;

public abstract class Xe {
	private String tenxe;
	private String cauhinh;
	private String tenhang;
	private String thongtinkythuat;
	
	public abstract String getThongTin();
	
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public String getCauhinh() {
		return cauhinh;
	}
	public void setCauhinh(String cauhinh) {
		this.cauhinh = cauhinh;
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
	
	public Xe(String tenxe, String cauhinh, String tenhang, String thongtinkythuat) {
		super();
		this.tenxe = tenxe;
		this.cauhinh = cauhinh;
		this.tenhang = tenhang;
		this.thongtinkythuat = thongtinkythuat;
	}
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Xe [tenxe=" + tenxe + ", cauhinh=" + cauhinh + ", tenhang=" + tenhang + ", thongtinkythuat="
				+ thongtinkythuat + "]";
	}
}
