package observer_bai2;

import observer_bai2.Observer;

public interface Subject {
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyAllObserver();
}
