package bai2_factory;

public class Factory {
	public Command createCommand(String name) {
		switch (name) {
		case "list":
			return new ListCommand();
		case "help":
			return new HelpCommand();
		case "region":
			return new RegionCommand();
		default:
			return null;
		}
	}
}
