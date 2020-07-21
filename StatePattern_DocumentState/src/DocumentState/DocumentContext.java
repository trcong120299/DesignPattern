package DocumentState;

public class DocumentContext {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void applyState() {
		this.state.handleRequest();
	}
	
}
