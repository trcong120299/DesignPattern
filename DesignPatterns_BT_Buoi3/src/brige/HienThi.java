package brige;

public abstract class HienThi {
	protected String ten;
	protected Ve ve;
	
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public HienThi(String ten, Ve ve) {
		super();
		this.ten = ten;
		this.ve = ve;
	}	
	public HienThi() {
		super();
	}
	
	public HienThi(Ve ve) {
		super();
		this.ve = ve;
	}
	public abstract String show();
}
