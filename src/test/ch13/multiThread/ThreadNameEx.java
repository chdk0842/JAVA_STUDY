package test.ch13.multiThread;


public class ThreadNameEx {

	public static void main(String[] args) {
		//메인 스레드 이름 가져오기
		Thread mainThread = Thread.currentThread(); //메인스레드 얻어옴
		System.out.println(mainThread.getName());
		//스레드 3개 생성
		for (int i =0; i<3; i++) {
			Thread threadA = new Thread() {	
				@Override
				public void run() {
					System.out.println(getName() + "실행"); //스레드 이름 가져옴
				}
				
			};
			
			threadA.start();
		}
		//chat 스레드 생성
		Thread chatthread = new Thread() {	
			@Override
			public void run() {
				System.out.println(getName() + "실행"); //스레드 이름 가져옴
			}
			
		};
		chatthread.setName("chat-thread"); //스레드가 실행되기 전에 이름 바꿈
		chatthread.start();
		}

}
