package dp.creational.builder;

public class ItalianPizza extends Pizza {

	private int olives;

	public static class ItalianPizzaBuilder extends Pizza.PizzaBuilder {

		private int olives;

		public PizzaBuilder olives(int olives) {
			this.olives = olives;
			return this;
		}

		@Override
		ItalianPizza build() {
			return new ItalianPizza(this);
		}

		public ItalianPizzaBuilder(String size, String type) {
			this.size = size;
			this.type = type;
		}

	}

	ItalianPizza(ItalianPizzaBuilder italianPizzaBuilder) {
		super(italianPizzaBuilder);
		olives = italianPizzaBuilder.olives;
	}

	@Override
	public String toString() {
		return "ItalianPizza [size=" + size + ", type=" + type + ", olives=" + olives + "]";
	}
	
}
