package bai5_state_maygiat;

public class PauseState implements State{
	
	private Maygiat maygiat;
	
	public PauseState(Maygiat maygiat) {
		super();
		this.maygiat = maygiat;
	}

	@Override
	public void start() {
		System.out.println("Resuming!");
		maygiat.setCurState(maygiat.getStartState());
	}

	@Override
	public void stop() {
		System.out.println("Stop!");
		maygiat.setCurState(maygiat.getStopState());
	}

	@Override
	public void pause() {
		System.out.println("Resuming!");
	}

}
