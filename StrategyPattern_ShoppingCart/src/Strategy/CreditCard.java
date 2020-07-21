package Strategy;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class CreditCard implements IThanhToanStrategy{

	private String sothe;
	private String tenintrenthe;
	private LocalDate ngayhethan;
	private String mabaomat;
	
	@Override
	public String toString() {
		return "CreditCard [sothe=" + sothe + ", tenintrenthe=" + tenintrenthe + ", ngayhethan=" + ngayhethan
				+ ", mabaomat=" + mabaomat + "]";
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(String sothe, String tenintrenthe, LocalDate ngayhethan, String mabaomat) {
		super();
		this.sothe = sothe;
		this.tenintrenthe = tenintrenthe;
		this.ngayhethan = ngayhethan;
		this.mabaomat = mabaomat;
	}

	public String getSothe() {
		return sothe;
	}

	public void setSothe(String sothe) {
		this.sothe = sothe;
	}

	public String getTenintrenthe() {
		return tenintrenthe;
	}

	public void setTenintrenthe(String tenintrenthe) {
		this.tenintrenthe = tenintrenthe;
	}

	public LocalDate getNgayhethan() {
		return ngayhethan;
	}

	public void setNgayhethan(LocalDate ngayhethan) {
		this.ngayhethan = ngayhethan;
	}

	public String getMabaomat() {
		return mabaomat;
	}

	public void setMabaomat(String mabaomat) {
		this.mabaomat = mabaomat;
	}

	@Override
	public void thanhtoan(double sotien) {
		// TODO Auto-generated method stub
		System.out.printf("Đã thanh toán bằng CreditCard với số tiền: %s", new DecimalFormat("#,##0").format(sotien), this.toString());
	}

}
