package decorator_bai1;

public class TruongBoMon extends GiangVienDecorator{

	public TruongBoMon(GiangVienComponent component) {
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
	public void lenKeHoachGiangDay() {
		System.out.println("Lên kế hoạch giảng dạy");
	}
	public void theoDoiChatLuongGiangDay() {
		System.out.println("Theo dõi chất lượng giảng dạy");
	}
	
}
