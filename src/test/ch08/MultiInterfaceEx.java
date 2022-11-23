package test.ch08;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		//자동형변환
		RemoteControl2 rc = new SmartTelevition();
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevition();
		searchable.search("naver");
	}

}
