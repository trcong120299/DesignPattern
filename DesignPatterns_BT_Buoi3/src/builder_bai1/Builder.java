package builder_bai1;

public interface Builder {
	public ConcreteBuilder tenChuTaiKhoan(String tenChuTaiKhoan);
	public ConcreteBuilder soTaiKhoan(String soTaiKhoan);
	public ConcreteBuilder diaChiEmail(String diaChiEmail);
	public ConcreteBuilder nhanThongBao(boolean nhanThongBao);
	public ConcreteBuilder suDungMobileBanking(boolean suDungMobileBanking);
	public TaiKhoanNganHang build();
}
