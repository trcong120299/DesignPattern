package bai3_abstract_factory;

public class Client {
	public static void main(String[] args) {
		IFactory factoryAnh= new FactoryAnh();
		IFactory factoryMy= new FactoryMy();
		SanPham quanAoAnh=factoryAnh.getQuanAo();
		SanPham quanAoMy=factoryMy.getQuanAo();
		System.out.println(quanAoAnh.getThongTin());
		System.out.println(quanAoMy.getThongTin());
		SanPham giayDepAnh=factoryAnh.getGiayDep();
		SanPham giayDepMy=factoryMy.getGiayDep();
		System.out.println(giayDepAnh.getThongTin());
		System.out.println(giayDepMy.getThongTin());
	}
}
