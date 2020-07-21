package decorator;

public abstract class AbstractDecorator implements IThucuong {
	
	protected IThucuong master;

	public AbstractDecorator(IThucuong master) {
		this.master = master;
	}
	
	public IThucuong getMaster() {
		return master;
	}
	
	@Override
	public double getDongia() {
		return master.getDongia();
	}
	
	@Override
	public String getMota() {
		return master.getMota();
	}
}
