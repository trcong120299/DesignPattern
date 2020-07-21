package decorator;

public class NVTruongBoMon extends AbsDecoratorChucNang{

	public NVTruongBoMon(IChucNang master) {
		super(master);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getChucNang() {
		// TODO Auto-generated method stub
		return super.getChucNang() + ", trưởng bộ môn";
	}
}
