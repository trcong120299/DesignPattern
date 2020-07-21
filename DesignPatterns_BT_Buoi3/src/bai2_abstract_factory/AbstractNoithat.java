package bai2_abstract_factory;

public abstract class AbstractNoithat {
	protected String maso;
	
	protected double dongia;

	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	@Override
	public String toString() {
		return "AbstractNoithat [maso=" + maso + ", dongia=" + dongia + "]";
	}
	
	public abstract String getThongtin() ;
}
