package facade;

public class Client {
	public static void main(String[] args) {
		ShopFacade.getInstance().buyProductByCashWithStandardShippingAndSendMessageWithMobilePhone("Cong", "0987654321");
		System.out.println("\n\n");
		ShopFacade.getInstance().buyProductByCreditCartWithFreeshippingAndSendMailToNotify("Cong", "12truongcong@gmail.com");
	}
}
