package bai1_factory;

public class XeFactory implements IXeFactory{

	@Override
	public Xe createXe(String loaixe) {
		loaixe = loaixe.toLowerCase();
		switch (loaixe) {
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
