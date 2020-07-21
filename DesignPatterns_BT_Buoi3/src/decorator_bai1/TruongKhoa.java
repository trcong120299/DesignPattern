package decorator_bai1;

public class TruongKhoa extends GiangVienDecorator{

	public TruongKhoa(GiangVienComponent component) {
		super(component);
	}

	@Override
	public void giangDay() {
		component.giangDay();
	}

	@Override
	public void nghienCuu() {
		component.nghienCuu();
	}
	public void quanLyTienDoDaoTao() {
		System.out.println("Quản lý tiến độ đào tạo");
	}
	public void dieuPhoiCongViec() {
		System.out.println("Điều phối công việc");
	}
	
}
