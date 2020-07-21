package bai3_factory;

public class Factory implements IFactory{

	@Override
	public Phong createPhong(String name) {
		switch (name) {
		case "1":
			return new PhongHangSang();
		case "2":
			return new PhongHangVua();
		case "3":
			return new PhongGiaRe();
		default:
			return null;
		}
	}

}
