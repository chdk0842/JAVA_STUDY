package test.ch08;

public interface Service {

	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
	}
	
	//private 메소드 (버전이 낮아서 인식못함)
//	private void defaultCommon() {
//		System.out.println("defaultMethod1 중복코드");
//		System.out.println("defaultMethod2 중복코드");
//	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
	}
	
}
