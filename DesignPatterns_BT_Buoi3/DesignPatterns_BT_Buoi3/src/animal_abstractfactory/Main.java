package animal_abstractfactory;

public class Main {
	public static void main(String[] args) {
		IAnimalFactory factory = new BirdFactory();
		Animal b1 = factory.createAnimal("owl");
		b1.display();
		
		factory = new MammalFactory();
		Animal c1 = factory.createAnimal("cat");
		c1.display();
	}
}
