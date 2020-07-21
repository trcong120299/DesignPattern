package facade;

public class KhachSanFacade {
	private static KhachSanFacade instance = new KhachSanFacade();
	
	private NhanPhong nhan;
	private TraPhong tra;
	
	private KhachSanFacade() {
		nhan = new NhanPhong();
		tra = new TraPhong();
	}
	
	public static KhachSanFacade getInstance() {
		return instance;
	}
	
	public void nhanPhongKS(String cmnd, String soPhong) {
		nhan.nhanPhong(cmnd, soPhong);
		System.out.println("Đã nhận phòng!");
	}
	
	public void traPhongKS(String cmnd, String soPhong) {
		tra.traPhong(cmnd, soPhong);
		System.out.println("Đã trả phòng!");
	}
}
