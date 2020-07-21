package bai2_abstract_factory;

public class GoFactory implements INoithatFactory{

	@Override
	public Ban createBan() {
		return new Bango();
	}

	@Override
	public Ghe createGhe() {
		return new Ghego();
	}



}
