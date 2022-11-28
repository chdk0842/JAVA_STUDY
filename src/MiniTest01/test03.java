package MiniTest01;

public class test03 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;

		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;

		System.out.println("총 금액 : " + money + "원");

		for (int i = 0; i < coinUnit.length; i++) {
			// 2680원 나누기 500원
			coin500 = money / 500;

			// 2680원을 500원으로 나눈 나머지값에서 나누기 100
			coin100 = money % 500 / 100;

			coin50 = money % 100 / 50;

			coin10 = money % 50 / 10;
		}
		System.out.println("500원 : " + coin500 + "개");
		System.out.println("100원 : " + coin100 + "개");
		System.out.println("50원 : " + coin50 + "개");
		System.out.println("10원 : " + coin10 + "개");
	}

}
