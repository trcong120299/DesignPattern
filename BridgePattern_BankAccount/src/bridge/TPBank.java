package bridge;

public class TPBank extends Bank{

	public TPBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.print("Create account of TPBank with type is ");
		account.createAccount();
	}

}
