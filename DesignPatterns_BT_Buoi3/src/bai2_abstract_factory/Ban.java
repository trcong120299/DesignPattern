package bai2_abstract_factory;

public abstract class Ban extends AbstractNoithat{
	private int dai;
	private int rong;

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}
	
	public abstract String getThongtin() ;
}
