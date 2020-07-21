package builder;

public class Client {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount.BankAccountBuilder("Truong Thanh Cong", "1234567890").email("12truongcong@gmail.com").nhanThongBao(true).builder();
		System.out.println(acc);
	}
}
