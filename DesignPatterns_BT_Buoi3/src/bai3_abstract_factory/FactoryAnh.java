package bai3_abstract_factory;

public class FactoryAnh implements IFactory{

	@Override
	public QuanAo getQuanAo() {
		// TODO Auto-generated method stub
		return new QuanAoAnh();
	}

	@Override
	public GiayDep getGiayDep() {
		// TODO Auto-generated method stub
		return new GiayDepAnh();
	}
	
}
