package bai3_abstract_factory;

public class FactoryMy implements IFactory{

	@Override
	public QuanAo getQuanAo() {
		// TODO Auto-generated method stub
		return new QuanAoMy();
	}

	@Override
	public GiayDep getGiayDep() {
		// TODO Auto-generated method stub
		return new GiayDepMy();
	}
	
}
