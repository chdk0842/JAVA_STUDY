package test.ch11.math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6]; //로또 번호 6개가 저장될 배열
		Random random = new Random(3);
		System.out.println("선택번호 : ");
		
		//랜덤 숫자 6개를 생성을 해서 배열에 넣어줌.
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; //1~45범위의 숫자로 만든다.
			 System.out.print(selectNumber[i] + ",");
		}
		
		System.out.println("");
		
		//당첨번호
		int[] winNumber = new int[6]; //로또 당첨 번호 6개가 저장될 배열
		Random random2 = new Random(5);
		System.out.println("당첨번호 : ");
		
		//랜덤 숫자 6개를 생성을 해서 배열에 넣어줌.
		for(int i = 0; i < 6; i++) {
			winNumber[i] = random2.nextInt(45) + 1; //1~45범위의 숫자로 만든다.
		    System.out.print(winNumber[i] + ",");
		}
		
		System.out.println("");
		
		//당첨여부
		Arrays.sort(selectNumber); //비교하기 전에 배열 값을 정렬 : 배열 내부의 값들이 정렬된 상태로 바뀐다.
		Arrays.sort(winNumber); 
		
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.print("당첨여부 : ");
		
		if (result) {
			System.out.print("당첨 되셨습니다,");
		}else {
			System.out.print("당첨 되지 않았습니다.");
		}

	}

}
