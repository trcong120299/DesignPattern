package decorator;

public class TranChauDen extends NuocDecorator{

	public TranChauDen(INuoc nuoc) {
		super(nuoc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return super.getMoTa() + " + Trân châu đen";
	}

	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia() + 10;
	}
	
}
