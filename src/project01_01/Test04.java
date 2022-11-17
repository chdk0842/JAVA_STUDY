package project01_01;

public class Test04 {

	public static void main(String[] args) {
		int charCode = 'A';
				
				if((65<=charCode) & (charCode<=90)) {
					System.out.println("대문자입니다.");
				}
		if((97<=charCode) && (charCode<=122)) {
			System.out.println("대문자입니다.");
		}
		if((48<=charCode) & (charCode<=57)) {
			System.out.println("0-9 숫자입니다.");
		}
		
	int value = 6;
	if ((value%2==0)| (value%3==0)) {
		System.out.println("2또는 3의 배수");
	}
	if ((value%2==0)|| (value%3==0)) {
		System.out.println("2또는 3의 배수");
	}
	
	}

}
