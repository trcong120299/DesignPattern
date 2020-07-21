package XeFactory;

public class XeFactory implements IXeFactory{

	@Override
	public Xe createXe(String loaixe) {
		// TODO Auto-generated method stub
		loaixe = loaixe.toLowerCase();
		switch (loaixe) {
		case "honda":
			return new Honda();
		case "toyota":
			return new Toyota();
		case "nexus":
			return new Nexus();
		default:
			break;
		}
		return null;
	}

}
