package builder_update;

public class Client {
	public static void main(String[] args) {
		TaiKhoanNganHang tk = new TaiKhoanNganHangBuilder().thongTinChinh("Truong Cong", "0987654321").builder();
		System.out.println(tk);
		
		TaiKhoanNganHang tk1 = new TaiKhoanNganHangBuilder().thongTinChinh("Cong Truong", "1234567890").email("12truongcong@gmail.com").nhanThongBao(true).builder();
		System.out.println(tk1);

	}
}
