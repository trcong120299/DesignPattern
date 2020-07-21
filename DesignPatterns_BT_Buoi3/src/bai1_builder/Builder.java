package bai1_builder;

public interface Builder {
	public void setTen(String ten);
	public void setSoTK(String soTK);
	public void setEmail(String email);
	public void setNhanThongBao(boolean nhanThongBao);
	public void setSuDungMobileBanking(boolean suDungMobileBanking);
	public TaiKhoanNganHang build();
}
