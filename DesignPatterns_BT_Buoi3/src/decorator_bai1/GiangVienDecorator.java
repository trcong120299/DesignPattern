package decorator_bai1;

public abstract class GiangVienDecorator implements GiangVienComponent{
	protected GiangVienComponent component;
	
	public GiangVienDecorator(GiangVienComponent component) {
		this.component = component;
	}

	public GiangVienComponent getComponent() {
		return component;
	}

	public void setComponent(GiangVienComponent component) {
		this.component = component;
	}
	@Override
	public void giangDay() {
		component.giangDay();
	}
	@Override
	public void nghienCuu() {
		component.nghienCuu();
	}
}
