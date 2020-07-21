package observer_bai2;

public class MyObserver implements Observer{

	private ConcreteSubject subject;
	public MyObserver(ConcreteSubject subject) {
		this.subject= subject;
		this.subject.attach(this);
	}


	@Override
	public void update() {
		System.out.println("Update software!");
	}

}
