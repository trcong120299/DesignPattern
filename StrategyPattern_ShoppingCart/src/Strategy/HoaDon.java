package Strategy;

import java.time.LocalDate;
import java.util.List;

public class HoaDon {
	private String mahd;
	private LocalDate ngayHoaDon;
	private IThanhToanStrategy hinhThucThanhToan;
	private List<MatHang> dsMatHang;
	
	public String getMahd() {
		return mahd;
	}
	public void setMahd(String mahd) {
		this.mahd = mahd;
	}
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}
	public IThanhToanStrategy getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}
	public void setHinhThucThanhToan(IThanhToanStrategy hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}
	public List<MatHang> getDsMatHang() {
		return dsMatHang;
	}
	public void setDsMatHang(List<MatHang> dsMatHang) {
		this.dsMatHang = dsMatHang;
	}
	public HoaDon(String mahd, LocalDate ngayHoaDon, List<MatHang> dsMatHang) {
		super();
		this.mahd = mahd;
		this.ngayHoaDon = ngayHoaDon;
		this.dsMatHang = dsMatHang;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void themMatHang(MatHang mh) {
		this.dsMatHang.add(mh);
	}
	
	public void xoaMatHang(MatHang mh) {
		this.dsMatHang.remove(mh);
	}
	
	public double getTongTien() {
		double tongTien = 0;
		for(MatHang mh: dsMatHang)
			tongTien += mh.getDongia();
		return tongTien;
	}
	
	public void thanhToan() {
		double tongTien = getTongTien();
		hinhThucThanhToan.thanhtoan(tongTien);
	}
	
	@Override
	public String toString() {
		String str = "Hóa đơn: \n Mã hóa đơn: " + mahd + "\n Ngày thanh toán: " + ngayHoaDon + "\n Hình thức thanh toán: " + hinhThucThanhToan + "\n Danh sách các mặt hàng: " + dsMatHang;
//		return "HoaDon [mahd=" + mahd + ", ngayHoaDon=" + ngayHoaDon + ", hinhThucThanhToan=" + hinhThucThanhToan
//				+ ", dsMatHang=" + dsMatHang + "]";
		return str;
	}	
}
