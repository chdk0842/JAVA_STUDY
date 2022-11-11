package project01_02;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ssn = "950107-1234123";
//		String firstName = ssn.substring(0,6);
//		System.out.println(firstName);
//		
//		String secondName = ssn.substring(7);
//		System.out.println(secondName);
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("파");
        System.out.println(location);
        
//       String substring = subject.substring(location);
//       System.out.println(substring);
       
       if(location == -1) {
    	   System.out.println("해당 문자열이 없습니다.");
       }
       
       boolean result = subject.contains("자바");
       
       if (result) {
    	   System.out.println("자바와 관련된 책입니다");
       
	}else {
		 System.out.println("자바와 관련된 책이 아입니다");
	}
	}
}

