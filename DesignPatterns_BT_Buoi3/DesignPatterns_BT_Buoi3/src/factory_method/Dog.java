package factory_method;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("Bark 'haw haw'");
	}
}
