package dp.creational.builder;


public abstract class Pizza {
	
	final String size;
    final String type;  

	abstract static class PizzaBuilder {
		String size;
	    String type;
		abstract Pizza build();

	}

	Pizza(PizzaBuilder pizzaBuilder) {
		size = pizzaBuilder.size;
        type = pizzaBuilder.type;
	}
}
