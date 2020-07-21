package facade;

public class ShopFacade {
	private AccountService accountService;
	private ShippingService shippingService;
	private PaymentService paymentService;
	private EmailService emailService;
	private SMSService smsService;
	
	public ShopFacade() {
		super();
		this.accountService = new AccountService();
		this.shippingService = new ShippingService();
		this.paymentService = new PaymentService();
		this.emailService = new EmailService();
		this.smsService = new SMSService();
	}
	public void thanhToanOnline(String email, String sdt) {
		accountService.layThongTinKhachHang(email);
		shippingService.freeShipping();
		paymentService.thanhToanPayPal();
		emailService.guiMail(email);
		smsService.guiSMS(sdt);
	}
	public void thanhToanTrucTiep(String email) {
		accountService.layThongTinKhachHang(email);
		shippingService.standardShipping();
		paymentService.thanhToanTienMat();
		emailService.guiMail(email);
	}
}
