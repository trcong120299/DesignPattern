package decorator;

public abstract class AbsDecoratorChucNang implements IChucNang{

	protected IChucNang master;
	
	public AbsDecoratorChucNang(IChucNang master) {
		this.master = master;
	}

	@Override
	public String getChucNang() {
		// TODO Auto-generated method stub
		return master.getChucNang();
	}
}
