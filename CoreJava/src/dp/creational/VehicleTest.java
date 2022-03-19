package dp.creational;


public class VehicleTest {
	
    public static void main(String[] args) {
    	AbstractVehicleFactory vehicleFactory = new VehicleFactory();
    	Vehicle vehicle = vehicleFactory.createtVehicle("Car");
    	System.out.printf("Vehicle of type %s created ", vehicle.getType());

    	vehicle = vehicleFactory.createtVehicle("Bus");
    	System.out.printf("\nVehicle of type %s created ", vehicle.getType());

    	vehicle = vehicleFactory.createtVehicle("Truck");
    	System.out.printf("\nVehicle of type %s created ", vehicle.getType());

    }
}
