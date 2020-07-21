package DocumentState;

public class Client {
	public static void main(String[] args) {
		DocumentContext context = new DocumentContext();
		
		context.setState(new NewState());
		context.applyState();
		
		context.setState(new PauseState());
		context.applyState();
		
		context.setState(new StopState());
		context.applyState();
	}
	
}
