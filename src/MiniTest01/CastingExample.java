package MiniTest01;

public class CastingExample {

	public static void main(String[] args) {
        Vehicle vehicle = new Bus();
	
		vehicle.run();
		vehicle.run();
		
		Bus vehicleA = (Bus)vehicle;
		vehicleA.checkFare();

	}

}
