package dp.creational.factory;

public class VehicleFactory extends AbstractVehicleFactory {

	public Vehicle createtVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		}
		if ("Car".equalsIgnoreCase(vehicleType)) {
			return new Car(vehicleType);
		} else if ("Bus".equalsIgnoreCase(vehicleType)) {
			return new Bus(vehicleType);
		} else if ("Truck".equalsIgnoreCase(vehicleType)) {
			return new Truck(vehicleType);
		}

		return null;
	}
}
