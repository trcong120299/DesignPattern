package decorator;

public class DuaSoi extends CheDecorator{

	public DuaSoi(IChe che) {
		super(che);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Dừa sợi";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 5;
	}

	
}
