package decorator;

public class Tra implements IThucuong {

	@Override
	public double getDongia() {
		return 10;
	}

	@Override
	public String getMota() {
		return "Trà xanh";
	}

}
