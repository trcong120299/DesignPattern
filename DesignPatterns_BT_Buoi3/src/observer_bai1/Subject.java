package observer_bai1;

public interface Subject {
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyAllObserver();
	public void changeStatus(LOGIN_STATUS status);
}
