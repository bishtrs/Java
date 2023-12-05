package dp.creational.factory;

public class Bus extends Vehicle {
	
    public void start() {
    	System.out.println("Bus started");
    }

	public Bus(String type) {
		super(type);
	}
	
}
