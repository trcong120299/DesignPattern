package decorator_bai2;

public abstract class Decorator implements IGame{
	protected IGame iGame;

	public Decorator(IGame iGame) {
		super();
		this.iGame = iGame;
	}
	
}
