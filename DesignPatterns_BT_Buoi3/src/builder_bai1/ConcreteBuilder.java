package builder_bai1;

public class ConcreteBuilder implements Builder{
	private String tenChuTaiKhoan;
	private String soTaiKhoan;
	private String diaChiEmail;
	private boolean nhanThongBao;
	private boolean suDungMobileBanking;
	
	public void setDefault() {
		this.tenChuTaiKhoan = "";
		this.soTaiKhoan = "";
		this.diaChiEmail = "";
		this.nhanThongBao = false;
		this.suDungMobileBanking = false;
	}
	public ConcreteBuilder() {
		setDefault();
	}
	public ConcreteBuilder tenChuTaiKhoan(String tenChuTaiKhoan) {
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		return this;
	}
	public ConcreteBuilder soTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		return this;
	}
	public ConcreteBuilder diaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
		return this;
	}
	public ConcreteBuilder nhanThongBao(boolean nhanThongBao) {
		this.nhanThongBao = nhanThongBao;
		return this;
	}
	public ConcreteBuilder suDungMobileBanking(boolean suDungMobileBanking) {
		this.suDungMobileBanking = suDungMobileBanking;
		return this;
	}
	public TaiKhoanNganHang build() {
		TaiKhoanNganHang tk= new TaiKhoanNganHang(tenChuTaiKhoan, soTaiKhoan, diaChiEmail, nhanThongBao, suDungMobileBanking);
		setDefault();
		return tk;
	}
}
