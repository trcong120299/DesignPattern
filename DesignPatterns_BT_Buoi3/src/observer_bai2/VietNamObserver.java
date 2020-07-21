package observer_bai2;

public class VietNamObserver implements Observer{
	
	private ConcreteSubject subject;
	public VietNamObserver(ConcreteSubject subject) {
		this.subject= subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Cập nhật phần mềm!");
	}

}
