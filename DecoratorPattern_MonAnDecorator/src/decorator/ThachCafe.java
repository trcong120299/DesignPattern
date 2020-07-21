package decorator;

public class ThachCafe extends NuocDecorator{

	public ThachCafe(INuoc nuoc) {
		super(nuoc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Thạch cafe";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 7;
	}

	
}
