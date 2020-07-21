package AbstractFactoryPattern;

public abstract class AbstractNoiThat {
	private double dongia;
	private int maso;
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getMaso() {
		return maso;
	}
	public void setMaso(int maso) {
		this.maso = maso;
	}
	
	public abstract String getThongTin() ;
	
	public AbstractNoiThat(double dongia, int maso) {
		super();
		this.dongia = dongia;
		this.maso = maso;
	}
	public AbstractNoiThat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AbstractNoiThat [dongia=" + dongia + ", maso=" + maso + "]";
	}
	
	
}
