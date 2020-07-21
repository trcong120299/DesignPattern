package bai1_builder;
/* Tên chủ tài khoản, số tài khoản, địa chỉ email, nhận
thông báo, sử dụng mobile banking*/
public class TaiKhoanNganHang {
	private String ten;
	private String soTK;
	private String email;
	private boolean nhanThongBao;
	private boolean suDungMobileBanking;
	
	public String getTen() {
		return ten;
	}
	public String getSoTK() {
		return soTK;
	}
	public String getEmail() {
		return email;
	}
	public boolean isNhanThongBao() {
		return nhanThongBao;
	}
	public boolean isSuDungMobileBanking() {
		return suDungMobileBanking;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNhanThongBao(boolean nhanThongBao) {
		this.nhanThongBao = nhanThongBao;
	}
	public void setSuDungMobileBanking(boolean suDungMobileBanking) {
		this.suDungMobileBanking = suDungMobileBanking;
	}
	public TaiKhoanNganHang(String ten, String soTK, String email, boolean nhanThongBao, boolean suDungMobileBanking) {
		super();
		this.ten = ten;
		this.soTK = soTK;
		this.email = email;
		this.nhanThongBao = nhanThongBao;
		this.suDungMobileBanking = suDungMobileBanking;
	}
	public TaiKhoanNganHang() {
		super();
		this.ten = "";
		this.soTK = "";
		this.email = "";
		this.nhanThongBao = false;
		this.suDungMobileBanking = false;
	}
	@Override
	public String toString() {
		return "TaiKhoanNganHang [ten=" + ten + ", soTK=" + soTK + ", email=" + email + ", nhanThongBao=" + nhanThongBao
				+ ", suDungMobileBanking=" + suDungMobileBanking + "]";
	}
	
}
