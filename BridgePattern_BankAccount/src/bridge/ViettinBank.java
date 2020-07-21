package bridge;

public class ViettinBank extends Bank{

	public ViettinBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.print("Create account of ViettinBank with type is ");
		account.createAccount();
	}

}
