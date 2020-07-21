package decorator;

public class Sua extends AbstractDecorator{

	public Sua(IThucuong master) {
		super(master);
	}

	@Override
	public double getDongia() {
		return master.getDongia() + 5;
	}
	
	@Override
	public String getMota() {
		return master.getMota() + ", sữa";
	}
}
