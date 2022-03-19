package dp.creational;

public class Banana extends Fruit {
	
	public Banana(String name) {
		super(name);
	}
	
	@Override
    public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }

}
