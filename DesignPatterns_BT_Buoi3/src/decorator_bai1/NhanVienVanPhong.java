package decorator_bai1;

public class NhanVienVanPhong extends NhanSu{
	private String phongBan;

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public NhanVienVanPhong(String ma, String ten, String sdt, String diaChi, String phongBan) {
		super(ma, ten, sdt, diaChi);
		this.phongBan = phongBan;
	}

	public NhanVienVanPhong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienVanPhong(String ma, String ten, String sdt, String diaChi) {
		super(ma, ten, sdt, diaChi);
		// TODO Auto-generated constructor stub
	}
	
}
