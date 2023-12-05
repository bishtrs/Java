package dp.creational.factory;


public abstract class Vehicle {
	
    final String type;
    
    public abstract void start();

	public Vehicle(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
