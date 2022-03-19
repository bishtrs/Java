package dp.creational;


public class Car extends Vehicle {
	
    public void start() {
    	System.out.println("Car started");
    }

	public Car(String type) {
		super(type);
	}
	
}
