package test.ch13.sync;

public class SyncEx {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		User1Thread user1 = new User1Thread();
	    user1.setCalculator(calculator);
	    user1.start();
	    
	    
	    User2Thread user2 = new User2Thread();
	    user2.setCalculator(calculator);
	    user2.start();
	    
	    //user1 실행 후 user2 실행 전에 동기화 걸림
	    //객체가 잠겨있을 때 접근 안됨.
	}

}
