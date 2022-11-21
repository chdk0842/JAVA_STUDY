package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*
		//자식객체
		Child child = new Child();
	
		
		Parent parent = child; //자동타입 변환
	    parent.method1();
	    parent.method2(); //오버라이드 된 메소드를 불러온다.
//	    parent.method3();
	    //자식 객체에 있는 메소드는 불러오지 않는다.
		
	    //자동타입 변환이 일어났을 때 오버라이드 된 메소드를 불러온다.
	
	    parent.a = 2;
//	    parent.b = 1; //자식객체에 있는 필드라서 못 불러온다
	    
	    */
		
	Parent parent = new Child(); //자동타입 변환
	
	//instanceof: 객체타입 확인을 위한 자바애서 제공하는 연산자
	//parent가 child	타입이 아니라면 강제타입 변환을 할 수 없으므로
	
	if (parent instanceof Child) {//parent 매개변수가 child 객체를 담고 있는가?
		
		
		Child child = (Child) parent; //강제타입 변환
		child.b = 1; //자식 객체에 있는 필드에 접근 가능
		child.method3(); //자식 메소드에 있는 필드에 접근가능
	  
	
		
	}
	
	}


}
