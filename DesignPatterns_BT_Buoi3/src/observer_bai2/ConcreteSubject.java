package observer_bai2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

	private List<Observer> observers= new ArrayList<Observer>();
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	public void updateSoftWare() {
		notifyAllObserver();
	}
}
