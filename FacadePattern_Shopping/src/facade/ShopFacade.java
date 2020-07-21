package facade;

public class ShopFacade {
	private static ShopFacade instance = new ShopFacade();
	
	private AccountService accountService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private EmailService emailService;
	private SmsService smsService;
	
	private ShopFacade() {
		accountService = new AccountService();
		paymentService = new PaymentService();
		shippingService = new ShippingService();
		emailService = new EmailService();
		smsService = new SmsService();
	}
	
	public static ShopFacade getInstance() {
		return instance;
	}
	
	public void buyProductByCreditCartWithFreeshippingAndSendMailToNotify(String name, String email) {
		accountService.getAccount(name);
		paymentService.paymentByCreditCard();
		shippingService.freeShipping();
		emailService.sendEMail(email);
		System.out.println("\t\tSuccess!");
	}
	
	public void buyProductByCashWithStandardShippingAndSendMessageWithMobilePhone(String name, String phoneNumber) {
		accountService.getAccount(name);
		paymentService.paymentByCash();
		shippingService.standardShipping();
		smsService.sendSMS(phoneNumber);
		System.out.println("\t\tSuccess!");
	}
}
