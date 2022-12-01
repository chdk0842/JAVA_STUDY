package singtone;

//프린터 객체는 무조건 하나만 생성되어야 한다.
public class Printer {
	//필드
	//1. 생성자를 private으로 바꿔준다.
	private static Printer printer = null;
	
	//외부에서 객체 생성을 못함
	private Printer() {
		
	}
	
	//메소드
	//2. 싱글톤 구현
	public static Printer getPrinter() {
		//프린터 객체가 null이면 printer객체 생성
		if (printer == null) {
			printer = new Printer();
		}
		
		//이미 printer객체가 생성이 되어있으면
		//나중에는 이미 생성된 printer가 리턴된다.
		return printer;
	}

}
