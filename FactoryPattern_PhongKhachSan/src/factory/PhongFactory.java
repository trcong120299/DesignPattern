package factory;

public class PhongFactory implements IPhongFactory{

	@Override
	public Phong taoPhong(int loai) {
		// TODO Auto-generated method stub
		switch (loai) {
		case 1:
			return new PhongHangSang();
		case 2: 
			return new PhongLoaiVua();
		case 3:
			return new PhongGiaRe();
		default:
			break;
		}
		return null;
	}

}
