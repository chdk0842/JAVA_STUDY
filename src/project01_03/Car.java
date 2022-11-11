package project01_03;

public class Car {
	
	String company = "현대자동차";
	String model ;
	String color ;
	int maxSpeed ;
	int speed;
// boolean start;
// int speed;


	// 자바에선 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다.
	
    Car(String model){
//    	this.model = model;
    	this(model, "은색", 250);
    }
    Car(String model, String color){
//    	this.model = model;
//    	this.color = color;
    	this(model, color, 250);
    }

	Car(String model, String color, int maxSpeed) {
      this.model = model;
      this.color = color;
      this.maxSpeed = maxSpeed;
	}

	

}
