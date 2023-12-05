package dp.creational.builder;

public class AustralianPizza extends Pizza {

	private int pepperoni;

	public static class AustralianPizzaBuilder extends Pizza.PizzaBuilder {

		private int pepperoni;

		public PizzaBuilder pepperoni(int pepperoni) {
			this.pepperoni = pepperoni;
			return this;
		}

		@Override
		AustralianPizza build() {
			return new AustralianPizza(this);
		}

		public AustralianPizzaBuilder(String size, String type) {
			this.size = size;
			this.type = type;
		}

	}

	AustralianPizza(AustralianPizzaBuilder italianPizzaBuilder) {
		super(italianPizzaBuilder);
		pepperoni = italianPizzaBuilder.pepperoni;
	}

	@Override
	public String toString() {
		return "AustralianPizza [size=" + size + ", type=" + type + ", pepperoni=" + pepperoni + "]";
	}
	
}
