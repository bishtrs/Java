package dp.creational;


public class Truck extends Vehicle {
	
    public void start() {
    	System.out.println("Truck started");
    }

	public Truck(String type) {
		super(type);
	}
	
}
