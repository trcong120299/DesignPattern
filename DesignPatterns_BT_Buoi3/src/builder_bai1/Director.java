package builder_bai1;

public class Director {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		TaiKhoanNganHang tk = builder.tenChuTaiKhoan("Hà").soTaiKhoan("123456").diaChiEmail("nguyenngocha@gmail.com")
				.nhanThongBao(false).suDungMobileBanking(false).build();
		TaiKhoanNganHang tk2= builder.diaChiEmail("ha2").build();
		System.out.println(tk);
		System.out.println(tk2);
	}
}
