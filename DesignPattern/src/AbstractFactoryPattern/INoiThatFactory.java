package AbstractFactoryPattern;

public interface INoiThatFactory {
	public Ban createBan(String loaiVatLieu);
	public Ghe createGhe(String loaiVatLieu);
}
