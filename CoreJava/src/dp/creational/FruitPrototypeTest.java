package dp.creational;

public class FruitPrototypeTest {

	public static void main(String[] args) {
		Fruit mangoPrototype  = FruitFactory.getPrototype("mango");
        System.out.println(mangoPrototype);
        System.out.println(mangoPrototype.getName());
        
        mangoPrototype  = FruitFactory.getPrototype("mango");
        System.out.println(mangoPrototype);
        System.out.println(mangoPrototype.getName());

        Fruit applePrototype  = FruitFactory.getPrototype("apple");
        System.out.println(applePrototype);
        System.out.println(applePrototype.getName());
        
        applePrototype  = FruitFactory.getPrototype("apple");
        System.out.println(applePrototype);
        System.out.println(applePrototype.getName());
        
        Fruit bananaPrototype  = FruitFactory.getPrototype("banana");
        System.out.println(bananaPrototype);
        System.out.println(bananaPrototype.getName());
	}

}
