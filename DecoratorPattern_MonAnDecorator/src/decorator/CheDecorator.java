package decorator;

public abstract class CheDecorator implements IMon {

	protected IChe che;
	
	public CheDecorator(IChe che) {
		super();
		this.che = che;
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return che.getMoTa();
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return che.getDonGia();
	}

}
