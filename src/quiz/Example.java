package quiz;

public class Example {
	
	//public을 사용하여 모든 클래스에서 사용할 수 있게함
	//static 값이 메모리 안에 바로 들어가므로 바로 사용할 수 있도록함.
	
	public static boolean isNumber(String str) {
		//주어진 문자열이 null이거나 빈문자열 "" 이라면 false를 반환한다.
		if (str == null || str.equals("")) return false;
		
		//주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
		//숫자로만 이루어져있으면 true, 아니면 false
		
		//str.length()은 문자열에서 문자갯수
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
//			System.out.println("값" + ch);
			
			//char a = 'A'; 65
			
			//ch가 문자열 0보다 작거나 9보다 크면 숫자가 아니다
			//'0'=48,'9'=57 (유니코드)
			if(ch < '0' || ch > '9') {
				
				return false;
			} 
		} return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str +"는 숫자입니까?" + isNumber(str));
        str ="123a";
        System.out.println(str +"는 숫자입니까?" + isNumber(str));
        		
	}

}
