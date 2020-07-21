package observer_bai1;

public class Client {
	public static void main(String[] args) {
		Subject subject= new ConcreteSubjet(new User("ha@gmail.com", "123.123.123.13"));
		Observer logger= new Logger(subject);
		Observer mailer= new Mailer(subject);
		subject.changeStatus(LOGIN_STATUS.SUCCESS);
		subject.changeStatus(LOGIN_STATUS.EXPIRED);
	}
}
