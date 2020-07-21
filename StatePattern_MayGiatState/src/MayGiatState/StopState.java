package MayGiatState;

public class StopState implements State{
	
	private Maygiat maygiat;
	
	public StopState(Maygiat maygiat) {
		super();
		this.maygiat = maygiat;
	}

	@Override
	public void start() {
		System.out.println("Ready!");
		maygiat.setCurState(maygiat.getStartState());
	}

	@Override
	public void stop() {
		System.out.println("Disable!");
	}

	@Override
	public void pause() {
		System.out.println("Disable!");
	}

}
