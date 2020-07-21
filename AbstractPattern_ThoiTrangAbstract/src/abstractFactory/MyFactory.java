package abstractFactory;

public class MyFactory implements IMatHang{

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
