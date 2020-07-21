package decorator;

public class Tranchau extends AbstractDecorator{

	public Tranchau(IThucuong master) {
		super(master);
	}

	@Override
	public double getDongia() {
		return master.getDongia() + 9;
	}
	
	@Override
	public String getMota() {
		return master.getMota() + ", trân châu";
	}
}

