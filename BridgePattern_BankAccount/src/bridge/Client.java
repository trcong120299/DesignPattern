package bridge;

public class Client {
	public static void main(String[] args) {
		Bank tpBank = new TPBank(new CheckingAccount());
		tpBank.createAccount();
		
		Bank viettinBank = new ViettinBank(new SavingAccount());
		viettinBank.createAccount();
	}
}
