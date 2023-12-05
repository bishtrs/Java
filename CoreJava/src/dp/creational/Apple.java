package dp.creational;

public class Apple extends Fruit {
	
	public Apple(String name) {
		super(name);
	}
	
	@Override
    public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }

}
