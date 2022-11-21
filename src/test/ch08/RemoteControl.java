package test.ch08;

//부모
public interface RemoteControl {
	
   //인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
   //추상 메소드 public
   //public이 없어도 컴파일 과정에서 public abstract가 자동으로 붙는다.
   public void turnOn();
   void turnOff();
   void setVolume(int volume);
   
   //디폴트 메소트 : 인터페이스에서 실행 메소드를 구현하고 싶을 때. 
   default void setMute(boolean mute) { //음소거
	  if(mute) {
		  System.out.println("음소거 합니다.");
		  setVolume(MIN_VOLUME);
	  }else {
		System.out.println("음소거 해제.");
	}
   }
   
   //정적 메소드 (static)
   //구현 코드를 쓸 수 있다.
   //public이 없어도 컴파일 과정에서 붙는다.
   static void changeBattery() {
	   System.out.println("건전지 교체.");
   }
}
