package bridge_bai2;

public class Ban extends NoiThat{
	private int dai;
	private int rong;
	
	public int getDai() {
		return dai;
	}

	public int getRong() {
		return rong;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}

	public Ban(String maSo, double donGia, VatLieu vatLieu, int dai, int rong) {
		super(maSo, donGia, vatLieu);
		this.dai = dai;
		this.rong = rong;
	}

	public Ban() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ban(String maSo, double donGia, VatLieu vatLieu) {
		super(maSo, donGia, vatLieu);
		// TODO Auto-generated constructor stub
	}
	

	public Ban(VatLieu vatLieu) {
		super(vatLieu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getThongTin() {
		return "Ban [dai=" + dai + ", rong=" + rong + ", maSo=" + maSo + ", donGia=" + donGia + ", vatLieu=" + vatLieu.getMoTa()
				+ "]";
	}

}
