package observer_bai1;

public class User {
	private String email;
	private String ip;
	private LOGIN_STATUS status;
	public String getEmail() {
		return email;
	}
	public String getIp() {
		return ip;
	}
	public LOGIN_STATUS getStatus() {
		return status;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setStatus(LOGIN_STATUS status) {
		this.status = status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String email, String ip) {
		super();
		this.email = email;
		this.ip = ip;
	}
	
}
