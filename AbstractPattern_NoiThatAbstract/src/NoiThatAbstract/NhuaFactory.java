package NoiThatAbstract;

public class NhuaFactory implements INoiThat{

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new BanNhua();
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new GheNhua();
	}

}
