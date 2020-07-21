package bai1_builder;

public class ConcreteBuilder implements Builder{
	private TaiKhoanNganHang tk;
	
	public ConcreteBuilder() {
		setDefault();
	}
	public void setDefault(){
		tk= new TaiKhoanNganHang();
	}
	public TaiKhoanNganHang build() {
		TaiKhoanNganHang tk2 = tk;
		setDefault();
		return tk2;
	}
	public void setTen(String ten) {
		tk.setTen(ten);
	}
	public void setSoTK(String soTK) {
		tk.setSoTK(soTK);
	}
	public void setEmail(String email) {
		tk.setEmail(email);
	}
	public void setNhanThongBao(boolean nhanThongBao) {
		tk.setNhanThongBao(nhanThongBao);
	}
	public void setSuDungMobileBanking(boolean suDungMobileBanking) {
		tk.setSuDungMobileBanking(suDungMobileBanking);
	}
}
