package decorator;

public class CotDua extends CheDecorator{

	public CotDua(IChe che) {
		super(che);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Cốt dừa";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 5;
	}

	
}
