package observer_bai1;

public class Logger implements Observer{
	
	public Logger(Subject subject) {
		subject.attach(this);
	}

	@Override
	public void update(User user) {
		System.out.println("Logger user change status "+ user.getStatus().toString());
	}

}
