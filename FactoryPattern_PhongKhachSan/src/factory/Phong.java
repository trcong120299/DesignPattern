package factory;

public abstract class Phong {
	private String tenPhong;
	
	private double giaPhong;
	
	public abstract String getThongTinPhong();

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public double getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}

	public Phong(String tenPhong, double giaPhong) {
		super();
		this.tenPhong = tenPhong;
		this.giaPhong = giaPhong;
	}

	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Phong [tenPhong=" + tenPhong + ", giaPhong=" + giaPhong + "]";
	}
	
	
}
