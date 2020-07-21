package FactoryMethodPattern;

public class XeFactory implements IXeFactory{

	@Override
	public Xe createXe(String name) {
		// TODO Auto-generated method stub
		name = name.toLowerCase();
		switch (name) {
		case "honda":
			return new Honda();
		case "nexus":
			return new Nexus();
		case "toyota":
			return new Toyota();
		default:
			break;
		}
		return null;
	}

}
