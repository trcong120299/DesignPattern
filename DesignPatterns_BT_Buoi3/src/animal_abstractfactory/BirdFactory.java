package animal_abstractfactory;

public class BirdFactory implements IAnimalFactory{

	@Override
	public Bird createAnimal(String animal) {
		animal = animal.toLowerCase();
		switch (animal) {
		case "owl":
			return new Owl();

		default:
			break;
		}
		return null;
	}

}
