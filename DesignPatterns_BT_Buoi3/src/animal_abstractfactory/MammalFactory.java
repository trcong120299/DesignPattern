package animal_abstractfactory;

public class MammalFactory implements IAnimalFactory{

	@Override
	public Mammal createAnimal(String animal) {
		animal = animal.toLowerCase();
		switch (animal) {
		case "cat":
			return new Cat();

		default:
			break;
		}
		return null;
	}

}
