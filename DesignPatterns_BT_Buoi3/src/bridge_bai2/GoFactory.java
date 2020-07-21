package bridge_bai2;

public class GoFactory extends AbstractFactory{

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new Ban(new Go());
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new Ghe(new Go());
	}

}
