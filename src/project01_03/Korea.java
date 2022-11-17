package project01_03;

public class Korea {
	
	//final 필드 (저장된 값들을 절대로 변경할 수 없는 최종값)
	//final 필드는 초기값을 무조건 줘야한다. (필드 선언시 주거나 혹은 생성자에서 줘야한다)
	final String nation = "대한민국";
	final String ssn; //주민번호
	

    //인스턴스 필드
	String name;
	
	//생성자 (class명과 같이)
	Korea(String ssn, String name){
		
	  this.ssn = ssn;
	  this.name = name;
	  
	}
	

}
