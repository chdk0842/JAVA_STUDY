package test.ch13.sync;

public class User1Thread extends Thread {
	private Calculator calculator;

	// 생성자
	public User1Thread() {
		setName("user1Thread"); // 스레드의 이름 변경
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	//스레드가 실행될 때 실행되는 코드
	@Override
	public void run() {
		calculator.setMemory1(100);
	}

    
}
