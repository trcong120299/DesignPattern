package NoiThatAbstract;

public abstract class Ban extends AbstractNoiThat{
	private int dai;
	private int rong;
	
	public abstract String getThongTin();
	
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
	
	
}
