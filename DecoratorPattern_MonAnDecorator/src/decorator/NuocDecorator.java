package decorator;

public abstract class NuocDecorator implements INuoc{
	protected INuoc nuoc;

	public NuocDecorator(INuoc nuoc) {
		super();
		this.nuoc = nuoc;
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return nuoc.getMoTa();
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return nuoc.getDonGia();
	}
	
	
}
