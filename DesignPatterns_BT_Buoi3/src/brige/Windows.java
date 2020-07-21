package brige;

public class Windows extends HienThi{
	
	
	public Windows() {
		super();
	}

	public Windows(String ten, Ve ve) {
		super(ten, ve);
	}

	public Windows(Ve ve) {
		super(ve);
	}

	@Override
	public String show() {
		return "Windows "+ ve.ve();
	}
	
}
