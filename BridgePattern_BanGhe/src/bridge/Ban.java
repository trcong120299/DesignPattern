package bridge;

public class Ban extends NoiThat{

	public Ban(VatLieu vatlieu) {
		this.vatlieu = vatlieu;
	}
	@Override
	public void getThongTin() {
		// TODO Auto-generated method stub
		System.out.print("Bàn ");
		vatlieu.getMoTa();
	}	
}
