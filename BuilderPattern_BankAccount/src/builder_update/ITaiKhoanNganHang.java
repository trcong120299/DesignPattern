package builder_update;

public interface ITaiKhoanNganHang {
	public ITaiKhoanNganHang thongTinChinh(String tenChuTK, String soTK);
	
	public ITaiKhoanNganHang email(String email);
	
	public ITaiKhoanNganHang nhanThongBao(boolean nhanThongBao);
	
	public ITaiKhoanNganHang suDungBanking(boolean suDungBanking);
	
	public TaiKhoanNganHang builder();
}
