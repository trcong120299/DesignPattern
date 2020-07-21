package bridge_bai2;

public class NhuaFactory extends AbstractFactory{

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new Ban(new Nhua());
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new Ghe(new Nhua());
	}

}
