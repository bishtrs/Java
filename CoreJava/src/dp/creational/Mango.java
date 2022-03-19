package dp.creational;

public class Mango extends Fruit {
	
	public Mango(String name) {
		super(name);
	}
	
	@Override
    public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }

}
