package factory;

public class PhongHocFactory implements IPhongHoc{

	@Override
	public PhongHoc taoPhong(String loai) {
		// TODO Auto-generated method stub
		loai = loai.toLowerCase();
		switch (loai) {
		case "lý thuyết":
			return new PhongLyThuyet();
		case "thực hành":
			return new PhongThucHanh();
		case "thí nghiệm":
			return new PhongThiNghiem();
		default:
			break;
		}
		return null;
	}

}
