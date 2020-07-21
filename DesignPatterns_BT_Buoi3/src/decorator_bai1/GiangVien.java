package decorator_bai1;

public class GiangVien extends NhanSu implements GiangVienComponent{
	private String linhVuc;
	private String trinhDo;
	public String getLinhVuc() {
		return linhVuc;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public GiangVien(String ma, String ten, String sdt, String diaChi, String linhVuc, String trinhDo) {
		super(ma, ten, sdt, diaChi);
		this.linhVuc = linhVuc;
		this.trinhDo = trinhDo;
	}
	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiangVien(String ma, String ten, String sdt, String diaChi) {
		super(ma, ten, sdt, diaChi);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void giangDay() {
		// TODO Auto-generated method stub
		System.out.println("Giảng dạy");
	}
	@Override
	public void nghienCuu() {
		// TODO Auto-generated method stub
		System.out.println("Nghiên cứu");
	}
	
}
