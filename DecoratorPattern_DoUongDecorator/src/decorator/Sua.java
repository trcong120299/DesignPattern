package decorator;

public class Sua extends AbstractDecorator{

	public Sua(IThucuong master) {
		super(master);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDongia() {
		// TODO Auto-generated method stub
		return super.getDongia() + 10;
	}

	@Override
	public String getMota() {
		// TODO Auto-generated method stub
		return super.getMota() + ", sữa";
	}


}
