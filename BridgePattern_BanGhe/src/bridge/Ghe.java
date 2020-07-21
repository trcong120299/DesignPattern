package bridge;

public class Ghe extends NoiThat{

	public Ghe(VatLieu vatlieu) {
		this.vatlieu = vatlieu;
	}
	@Override
	public void getThongTin() {
		// TODO Auto-generated method stub
		System.out.print("Ghế ");
		vatlieu.getMoTa();
	}

}
