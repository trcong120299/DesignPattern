package observer_bai1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjet implements Subject{
	
	private User user;
	private List<Observer> observers= new ArrayList<Observer>();
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		int i= observers.indexOf(o);
		if(i>0)
			observers.remove(o);
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update(user);
		}
	}
	public void changeStatus(LOGIN_STATUS status) {
		user.setStatus(status);
		notifyAllObserver();
	}

	public ConcreteSubjet(User user) {
		super();
		this.user = user;
	}
	
	
}
