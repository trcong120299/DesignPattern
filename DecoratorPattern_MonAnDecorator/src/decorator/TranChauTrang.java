package decorator;

public class TranChauTrang extends NuocDecorator{

	public TranChauTrang(INuoc nuoc) {
		super(nuoc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Trân châu trắng";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 6;
	}

	
}
