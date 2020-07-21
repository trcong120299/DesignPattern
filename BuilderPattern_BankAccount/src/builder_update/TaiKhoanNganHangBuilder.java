package builder_update;

public class TaiKhoanNganHangBuilder implements ITaiKhoanNganHang{
	
	private String tenChuTK;
	
	private String soTK;
	
	private String email;
	
	private boolean nhanThongBao;
	
	private boolean suDungBanking;

	@Override
	public ITaiKhoanNganHang thongTinChinh(String tenChuTK, String soTK) {
		// TODO Auto-generated method stub
		this.tenChuTK = tenChuTK;
		this.soTK = soTK;
		return this;
	}

	@Override
	public ITaiKhoanNganHang email(String email) {
		// TODO Auto-generated method stub
		this.email = email;
		return this;
	}

	@Override
	public ITaiKhoanNganHang nhanThongBao(boolean nhanThongBao) {
		// TODO Auto-generated method stub
		this.nhanThongBao = nhanThongBao;
		return this;
	}

	@Override
	public ITaiKhoanNganHang suDungBanking(boolean suDungBanking) {
		// TODO Auto-generated method stub
		this.suDungBanking = suDungBanking;
		return this;
	}

	@Override
	public TaiKhoanNganHang builder() {
		// TODO Auto-generated method stub
		return new TaiKhoanNganHang(this.tenChuTK, this.soTK, this.email, this.nhanThongBao, this.suDungBanking);
	}
	
}
