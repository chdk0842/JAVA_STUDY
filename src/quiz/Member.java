package quiz;

public class Member {
	// 필드
	String name;
	String id;
	String password;
	int age;

	// 생성자
	Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	//로그인 메소드
	 boolean login() {
	
		 if(id == "hong" && password == "12345") {
		System.out.println("로그인 되었습니다."); 
           return true;
		 }else {
		System.out.println("id 또는 password가 올바르지 않습니다.");
		   return false; 
		 }
	    
	 }
	
	 //로그아웃
	 void logout(String id) {
		   System.out.print( id + " 님이 로그아웃 되었습니다.");
		 }
	

}
