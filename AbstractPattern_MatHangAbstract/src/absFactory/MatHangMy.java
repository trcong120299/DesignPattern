package absFactory;

public class MatHangMy implements IMatHang{

	@Override
	public QuanAo createQuanAo() {
		// TODO Auto-generated method stub
		return new QuanAoMy();
	}

	@Override
	public GiayDep createGiayDep() {
		// TODO Auto-generated method stub
		return new GiayDepMy();
	}
	
}
