package project01_02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String ssn = "0001074230123"; //주민번호
//       char sex = ssn.charAt(6);
//       int length = ssn.length();
//       
//       if (length == 13) {
//    	  System.out.println("주민번호 자릿수가 맞습니다.");
//       }else {
//    	   System.out.println("주민번호 자릿수가 아닙니다.");
//       }
//       
//       switch (sex) {
//       case '1' :
//       case '3' :
//    	    System.out.println("남자");
//    	    break;
//       case '2' :
//       case '4' :
//    	    System.out.println("여자");
//    	    break;
//       }
		
	 String oldStr = "자바 문자열";
	 String newStr = oldStr.replace("자바","JAVA");
	 
	 System.out.println(oldStr);
	 System.out.println(newStr);
	}

}
