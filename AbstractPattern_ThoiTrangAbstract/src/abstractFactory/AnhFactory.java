package abstractFactory;

public class AnhFactory implements IMatHang{

	@Override
	public QuanAo createQuanAo() {
		// TODO Auto-generated method stub
		return new QuanAoAnh();
	}

	@Override
	public GiayDep createGiayDep() {
		// TODO Auto-generated method stub
		return new GiayDepAnh();
	}

}
