package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
		 Car myCar = new Car();
		 
		 //tire 객체를 넣어준다.
		myCar.tire = new HanKookTire(); //타이어 지정 자동형변환
		myCar.run(); //타이어 굴리기
	}

}
