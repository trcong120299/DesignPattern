package state;

public class MayGiat {
	private State trangThai;

	public State getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(State trangThai) {
		this.trangThai = trangThai;
	}
	
	public void applyState() {
		this.trangThai.trangThaiHienTai();
	}
}
