package project01_1;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 75;
		
		if (score >= 90) {
          System.out.println("90점 이상");
		}else if(score >= 80){
			 System.out.println("80점 이상");
		}else if(score >= 70) {
			 System.out.println("70점 이상");
		}else {
			 System.out.println("공부ㄱㄱ");
		}
		
		
		int num = (int) (Math.random() *6)+1;
		
		
		if (num == 1) {
          System.out.println("1");
		}else if(num == 2){
			 System.out.println("2");
		}else if(num == 3){
			 System.out.println("3");
		}else if(num == 4) {
			 System.out.println("4");
		}else if(num == 5){
			 System.out.println("5");
		}else {
			 System.out.println("6");
		}
		
	}

}