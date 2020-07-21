package bai2_abstract_factory;

public class NhuaFactory implements INoithatFactory{

	@Override
	public Ban createBan() {
		return new Bannhua();
	}

	@Override
	public Ghe createGhe() {
		return new Ghenhua();
	}

}
