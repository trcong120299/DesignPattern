package decorator;

public class Client {
	public static void main(String[] args) {		
		GiangVien gv = new GiangVien("123", "Nguyễn Văn A", null);
		
		IChucNang ichucNang = new NVGiangDay();
		ichucNang = new NVTruongBoMon(ichucNang);
		ichucNang = new NVTruongKhoa(ichucNang);
		gv.setChucnang(ichucNang);
		
		System.out.println(gv.getHoten() + " có nhiệm vụ: " + gv.getChucnang().getChucNang());
		
	}
}
