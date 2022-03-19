package junit5;

public enum Colors {

	BLUE("Blue"), GREEN("Green"), YELLOW("Yellow");

	private final String color;

	Colors(String color) {
		this.color = color;
	}

	public String value() {
		return color;
	}

}
