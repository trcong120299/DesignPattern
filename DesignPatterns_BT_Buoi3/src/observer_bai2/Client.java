package observer_bai2;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject= new ConcreteSubject();
		new MyObserver(subject);
		new VietNamObserver(subject);
		subject.updateSoftWare();
	}
}
