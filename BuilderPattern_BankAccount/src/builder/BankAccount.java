package builder;

public class BankAccount {
	private String tenChuTK;
	
	private String soTK;
	
	private String email;
	
	private boolean nhanThongBao;
	
	private boolean suDungBanking;

	public String getTenChuTK() {
		return tenChuTK;
	}

	public void setTenChuTK(String tenChuTK) {
		this.tenChuTK = tenChuTK;
	}

	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNhanThongBao() {
		return nhanThongBao;
	}

	public void setNhanThongBao(boolean nhanThongBao) {
		this.nhanThongBao = nhanThongBao;
	}

	public boolean isSuDungBanking() {
		return suDungBanking;
	}

	public void setSuDungBanking(boolean suDungBanking) {
		this.suDungBanking = suDungBanking;
	}

	public BankAccount(String tenChuTK, String soTK, String email, boolean nhanThongBao, boolean suDungBanking) {
		super();
		this.tenChuTK = tenChuTK;
		this.soTK = soTK;
		this.email = email;
		this.nhanThongBao = nhanThongBao;
		this.suDungBanking = suDungBanking;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankAccount [tenChuTK=" + tenChuTK + ", soTK=" + soTK + ", email=" + email + ", nhanThongBao="
				+ nhanThongBao + ", suDungBanking=" + suDungBanking + "]";
	}
	
	public static class BankAccountBuilder {
		private String tenChuTK;
		
		private String soTK;
		
		private String email;
		
		private boolean nhanThongBao;
		
		private boolean suDungBanking;

		public BankAccountBuilder(String tenChuTK, String soTK) {
			super();
			this.tenChuTK = tenChuTK;
			this.soTK = soTK;
		}
		
		public BankAccountBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public BankAccountBuilder nhanThongBao(boolean nhanThongBao) {
			this.nhanThongBao = nhanThongBao;
			return this;
		}
		
		public BankAccountBuilder suDungBanking(boolean suDungBanking) {
			this.suDungBanking = suDungBanking;
			return this;
		}
		
		public BankAccount builder() {
			return new BankAccount(this.tenChuTK, this.soTK, this.email, this.nhanThongBao, this.suDungBanking);
		}
	}
}
