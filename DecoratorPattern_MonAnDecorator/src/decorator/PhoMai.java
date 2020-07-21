package decorator;

public class PhoMai extends CheDecorator{

	public PhoMai(IChe che) {
		super(che);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Phô mai";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 12;
	}

	
}
