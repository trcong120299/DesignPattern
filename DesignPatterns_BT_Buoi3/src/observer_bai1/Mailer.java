package observer_bai1;

public class Mailer implements Observer{
	
	public Mailer(Subject subject) {
		subject.attach(this);
	}
	@Override
	public void update(User user) {
		if(user.getStatus().equals(LOGIN_STATUS.EXPIRED))
			System.out.println("email to "+ user.getEmail());
	}

}
