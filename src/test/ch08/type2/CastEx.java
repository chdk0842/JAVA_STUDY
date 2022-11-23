package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();	
		
		ride(taxi);
		ride(bus);
		
		}
	
	public static void ride(Vehicle vehicle) {
		//vehicle이 bus 객체를 갖고 있는가?
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle; //강제형변환(자식의 것을 쓰기 위해)
			bus.checkFare();
		}
	}

}
