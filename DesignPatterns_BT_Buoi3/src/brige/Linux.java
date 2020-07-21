package brige;

public class Linux extends HienThi{

	public Linux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Linux(String ten, Ve ve) {
		super(ten, ve);
		// TODO Auto-generated constructor stub
	}

	public Linux(Ve ve) {
		super(ve);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String show() {
		return "Linux "+ ve.ve();
	}

}
