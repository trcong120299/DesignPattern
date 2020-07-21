package decorator_bai1;

public class Client {
	public static void main(String[] args) {
		GiangVienComponent component= new GiangVien();
		component= new TruongKhoa(component);
		component.giangDay();
		((TruongKhoa)component).dieuPhoiCongViec();
	}
}
