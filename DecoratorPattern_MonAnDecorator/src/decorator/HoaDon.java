package decorator;

import java.time.LocalDate;
import java.util.List;

public class HoaDon {
	private String id;
	
	private LocalDate ngaygio;
	
	private List<IMon> dsMon;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getNgaygio() {
		return ngaygio;
	}

	public void setNgaygio(LocalDate ngaygio) {
		this.ngaygio = ngaygio;
	}

	public List<IMon> getDsMon() {
		return dsMon;
	}

	public void setDsMon(List<IMon> dsMon) {
		this.dsMon = dsMon;
	}

	public HoaDon(String id, LocalDate ngaygio, List<IMon> dsMon) {
		super();
		this.id = id;
		this.ngaygio = ngaygio;
		this.dsMon = dsMon;
	}

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HoaDon [id=" + id + ", ngaygio=" + ngaygio + ", dsMon=" + dsMon + "]";
	}
	
	public void them(IMon item) {
		dsMon.add(item);
	}
	
	public double tongtien() {
		double tong = 0;
		for(IMon item : dsMon) {
			tong += item.getDonGia();
		}
		return tong;
	}
	
	public void display() {
		for(IMon item : dsMon) {
			System.out.println(item.getMoTa());
		}
	}
}
