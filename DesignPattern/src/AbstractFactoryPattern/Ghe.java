package AbstractFactoryPattern;

public abstract class Ghe extends AbstractNoiThat{
	private float dai;
	private float rong;
	public float getDai() {
		return dai;
	}
	public void setDai(float dai) {
		this.dai = dai;
	}
	public float getRong() {
		return rong;
	}
	public void setRong(float rong) {
		this.rong = rong;
	}
	@Override
	public String getThongTin() {
		// TODO Auto-generated method stub
		return "Ghe";
	}
	
	
}
