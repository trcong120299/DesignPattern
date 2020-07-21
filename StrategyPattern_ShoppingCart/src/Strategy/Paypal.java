package Strategy;

import java.text.DecimalFormat;

public class Paypal implements IThanhToanStrategy{

	private String email;
	private String password;
	
	public Paypal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paypal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Paypal [email=" + email + ", password=" + password + "]";
	}

	@Override
	public void thanhtoan(double sotien) {
		// TODO Auto-generated method stub
		System.out.printf("Đã thanh toán bằng Paypal với số tiền: %s", new DecimalFormat("#,##0").format(sotien), this.toString());
	}

}
