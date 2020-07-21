package bai5_state_maygiat;

public class StartState implements State{
	
	private Maygiat maygiat;
	
	public StartState(Maygiat maygiat) {
		this.maygiat = maygiat;
	}

	@Override
	public void start() {
		System.out.println("Working!");
	}

	@Override
	public void stop() {
		System.out.println("Stop!");
		maygiat.setCurState(maygiat.getStopState());
	}

	@Override
	public void pause() {
		System.out.println("Pause!");
		maygiat.setCurState(maygiat.getPauseState());
	}

}
