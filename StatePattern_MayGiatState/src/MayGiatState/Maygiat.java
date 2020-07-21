package MayGiatState;

public class Maygiat {
	
	private State curState;
	private State startState;
	private State stopState;
	private State pauseState;
	
	public Maygiat() {
		startState = new StartState(this);
		stopState = new StopState(this);
		pauseState = new PauseState(this);
		
		curState = stopState;
	}
	
	public void start() {
		curState.start();
	}
	
	public void pause() {
		curState.pause();
	}
	
	public void stop() {
		curState.stop();
	}
	
	public void setCurState(State curState) {
		this.curState = curState;
	}
	
	public State getStartState() {
		return startState;
	}
	
	public State getStopState() {
		return stopState;
	}
	
	public State getPauseState() {
		return pauseState;
	}
	
	public State getCurState() {
		return curState;
	}
	
}
