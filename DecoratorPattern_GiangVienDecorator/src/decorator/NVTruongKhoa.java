package decorator;

public class NVTruongKhoa extends AbsDecoratorChucNang{

	public NVTruongKhoa(IChucNang master) {
		super(master);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getChucNang() {
		// TODO Auto-generated method stub
		return super.getChucNang() + ", trưởng khoa";
	}
	
}
