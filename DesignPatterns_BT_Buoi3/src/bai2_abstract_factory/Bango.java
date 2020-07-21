package bai2_abstract_factory;

public class Bango extends Ban{

	@Override
	public String getThongtin() {
		return "Ban go! Kich thuoc " + getDai() + "x" + getRong();
	}
}
