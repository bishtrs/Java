package dp.creational;

public class TestPizzaBuilder {

	public static void main(String[] args) {
		Pizza pizza = new ItalianPizza.ItalianPizzaBuilder("pan", "thinCrust").olives(10).build();
        System.out.println(pizza);
        pizza = new AustralianPizza.AustralianPizzaBuilder("pan", "thinCrust").pepperoni(15).build();
        System.out.println(pizza);
	}

}
