package AbstractFactoryPattern;

public class NhuaFactory implements INoiThatFactory{

	@Override
	public Ban createBan(String loaiVatLieu) {
		// TODO Auto-generated method stub
		loaiVatLieu = loaiVatLieu.toLowerCase();
		switch (loaiVatLieu) {
		case "go":
			new BanGo();
		case "nhua":
			new BanNhua();
		default:
			break;
		}
		return null;
	}

	@Override
	public Ghe createGhe(String loaiVatLieu) {
		// TODO Auto-generated method stub
		return null;
	}

}
