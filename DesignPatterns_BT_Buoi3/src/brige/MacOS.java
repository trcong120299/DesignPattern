package brige;

public class MacOS extends HienThi{

	public MacOS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MacOS(String ten, Ve ve) {
		super(ten, ve);
		// TODO Auto-generated constructor stub
	}

	public MacOS(Ve ve) {
		super(ve);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String show() {
		return "MacOS "+ ve.ve();
	}

}
