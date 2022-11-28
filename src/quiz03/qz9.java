package quiz03;

public class qz9 {

	public static void main(String[] args) {

		//1번째 방법
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		
		//2번째 방법
		if(num < 0) {
			System.out.println("음수");
		}else if (num > 0){
			System.out.println("양수");
		}else {
			System.out.println("0 입니다");
		}

	}

}
