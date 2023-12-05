package dp.creational;

public abstract class Fruit implements Cloneable {
	
	private String name; 
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }
	
	public String getName() {
		return this.name;
	}

}
