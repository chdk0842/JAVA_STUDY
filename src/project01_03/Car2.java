package project01_03;

public class Car2 {

	// 인스턴스 필드
	int speed;

	// 인스턴스 메소드
	// void 리턴 값 없음
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	

//	static {
//		this.speed = 200; //안됨
//		
//	}
	
	// 스타틱(정적) 메소드
	static void simulate() {
     Car2 myCar = new Car2();
     
     myCar.speed = 200;
     myCar.run();
    }

	public static void main(String[] args) {
		 simulate();

		 Car2 myCar = new Car2();
	     
	     myCar.speed = 60;
	     myCar.run();

	}

}
