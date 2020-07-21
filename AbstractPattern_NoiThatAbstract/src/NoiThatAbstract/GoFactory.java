package NoiThatAbstract;

public class GoFactory implements INoiThat{

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new BanGo();
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new GheGo();
	}
	
}
