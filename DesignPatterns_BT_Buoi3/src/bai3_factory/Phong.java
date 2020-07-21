package bai3_factory;

public abstract class Phong {
	protected long soPhong;
	public abstract String getThongTin();
	public abstract double getGiaCa();
	public long getSoPhong() {
		return soPhong;
	}
	
	public void setSoPhong(long soPhong) {
		this.soPhong = soPhong;
	}
	
	public Phong(long soPhong) {
		super();
		this.soPhong = soPhong;
	}
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return getThongTin()+" [soPhong=" + soPhong + ", giaCa=" + getGiaCa() + "]";
	}
	
}
