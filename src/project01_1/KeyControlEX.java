package project01_1;

import java.util.Scanner;

public class KeyControlEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		int speed = 0;;
		
		while(run) {
			System.out.println("-------------");
			System.out.println("1.증속, 2.감소, 3.중지");
			System.out.println("-------------");
			System.out.println("선택 :");
			
			String strNum = scanner.nextLine();
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			}else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: " + speed);
			}else if (strNum.equals("3")) {
				run = false;
				System.out.println(" 프로그램 종료 ");
			}
		}
	}

}
