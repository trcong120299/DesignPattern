package factory;

public abstract class PhongHoc {
	private String maso;
	
	private int soluong;
	
	public abstract void getPhong();

	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public PhongHoc(String maso, int soluong) {
		super();
		this.maso = maso;
		this.soluong = soluong;
	}

	public PhongHoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PhongHoc [maso=" + maso + ", soluong=" + soluong + "]";
	}
	
	
}
