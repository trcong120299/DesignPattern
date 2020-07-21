package builder_bai1;

public class TaiKhoanNganHang {
	private String tenChuTaiKhoan;
	private String soTaiKhoan;
	private String diaChiEmail;
	private boolean nhanThongBao;
	private boolean suDungMobileBanking;
	public TaiKhoanNganHang(String tenChuTaiKhoan, String soTaiKhoan, String diaChiEmail, boolean nhanThongBao,
			boolean suDungMobileBanking) {
		super();
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soTaiKhoan = soTaiKhoan;
		this.diaChiEmail = diaChiEmail;
		this.nhanThongBao = nhanThongBao;
		this.suDungMobileBanking = suDungMobileBanking;
	}
	public String getTenChuTaiKhoan() {
		return tenChuTaiKhoan;
	}
	public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
		this.tenChuTaiKhoan = tenChuTaiKhoan;
	}
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getDiaChiEmail() {
		return diaChiEmail;
	}
	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
	}
	public boolean isNhanThongBao() {
		return nhanThongBao;
	}
	public void setNhanThongBao(boolean nhanThongBao) {
		this.nhanThongBao = nhanThongBao;
	}
	public boolean isSuDungMobileBanking() {
		return suDungMobileBanking;
	}
	public void setSuDungMobileBanking(boolean suDungMobileBanking) {
		this.suDungMobileBanking = suDungMobileBanking;
	}
	@Override
	public String toString() {
		return "TaiKhoanNganHang [tenChuTaiKhoan=" + tenChuTaiKhoan + ", soTaiKhoan=" + soTaiKhoan + ", diaChiEmail="
				+ diaChiEmail + ", nhanThongBao=" + nhanThongBao + ", suDungMobileBanking=" + suDungMobileBanking + "]";
	}
	
}
