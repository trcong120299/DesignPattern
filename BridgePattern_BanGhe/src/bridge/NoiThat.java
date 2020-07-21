package bridge;

public abstract class NoiThat {
	protected String maso;
	protected double dongia;
	protected VatLieu vatlieu;
	
	public NoiThat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoiThat(VatLieu vatlieu) {
		super();
		this.vatlieu = vatlieu;
	}

	public NoiThat(String maso, double dongia, VatLieu vatlieu) {
		super();
		this.maso = maso;
		this.dongia = dongia;
		this.vatlieu = vatlieu;
	}

	public abstract void getThongTin();
}
