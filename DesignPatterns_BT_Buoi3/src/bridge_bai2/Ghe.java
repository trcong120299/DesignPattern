package bridge_bai2;

public class Ghe extends NoiThat{
	
	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ghe(String maSo, double donGia, VatLieu vatLieu) {
		super(maSo, donGia, vatLieu);
		// TODO Auto-generated constructor stub
	}
	

	public Ghe(VatLieu vatLieu) {
		super(vatLieu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getThongTin() {
		return "Ghe [maSo=" + maSo + ", donGia=" + donGia + ", vatLieu=" + vatLieu.getMoTa() + "]";
	}

}
