package Strategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		MatHang mh1 = new MatHang("1", "Cam", 12000);
		MatHang mh2 = new MatHang("2", "Cam", 15000);
		MatHang mh3 = new MatHang("3", "Buoi", 20000);
		
		List<MatHang> listMH = new ArrayList<MatHang>();
		
		HoaDon hd = new HoaDon("HD01", LocalDate.now(), listMH);
		
		hd.themMatHang(mh1);
		hd.themMatHang(mh2);
		hd.themMatHang(mh3);
		
		IThanhToanStrategy pttt = new CreditCard("123-123-123-123", "TRUONG THANH CONG", LocalDate.of(2022, 12, 30), "1234567890");
		hd.setHinhThucThanhToan(pttt);
		System.out.println(hd);
		System.out.println("Thông tin thanh toán: ");
		hd.thanhToan();
		
		List<MatHang> listMH1 = new ArrayList<MatHang>();
		
		HoaDon hd1 = new HoaDon("HD02", LocalDate.now(), listMH1);
		
		hd1.themMatHang(mh1);
		hd1.themMatHang(mh2);
		hd1.themMatHang(mh3);
		
		IThanhToanStrategy pttt1 = new Paypal("12truongcong@gmail.com", "123123123");
		hd1.setHinhThucThanhToan(pttt1);
		System.out.println("\n" + hd1);
		System.out.println("Thông tin thanh toán: ");
		hd1.thanhToan();
		
	}
}
