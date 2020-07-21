package bai1_builder;

public class Client {
	public static void main(String[] args) {
		Builder builder= new ConcreteBuilder();
		builder.setSoTK("1");
		builder.setTen("Ha");
		builder.setEmail("ha@gmail.com");
		builder.setNhanThongBao(false);
		builder.setSuDungMobileBanking(false);
		TaiKhoanNganHang tk = builder.build();
		System.out.println(tk);
		builder.setSoTK("2");
		builder.setTen("Ha");
		
		builder.setNhanThongBao(false);
		builder.setSuDungMobileBanking(false);
		TaiKhoanNganHang tk2 = builder.build();
		System.out.println(tk2);
	}
}
