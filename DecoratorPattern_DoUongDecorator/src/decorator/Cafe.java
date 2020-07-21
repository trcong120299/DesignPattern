package decorator;

public class Cafe implements IThucuong{

	@Override
	public double getDongia() {
		return 29;
	}

	@Override
	public String getMota() {
		return "Cafe";
	}

}
