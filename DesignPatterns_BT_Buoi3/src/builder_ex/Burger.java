package builder_ex;
public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
