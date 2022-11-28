package quiz06;

import java.util.Scanner;

public class BankApplication {

	private static Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	private static Account[] accountArray = new Account[100]; // 계좌 객체를 담을 배열

	public static void main(String[] args) {
		boolean run = true;
		while (run) {

			System.out.println("==========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("==========================================");
			System.out.println("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료.");
	}

	// 1. 계좌 생성
	public static void createAccount() {

		System.out.println("==========================================");
		System.out.println("계좌생성");
		System.out.println("==========================================");

		System.out.println("계좌번호:");

		String ano = scanner.next();

		System.out.println("계좌주:");

		String owner = scanner.next();

		System.out.println("초기입금액:");

		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance); // 계좌 만듦

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성 되었습니다.");
				break;

			}

		}

	}

	// 2. 계좌 목록
	public static void accountList() {
		System.out.println("==========================================");
		System.out.println("계좌목록");
		System.out.println("==========================================");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}

	}

	// 3. 예금
	public static void deposit() {
		System.out.println("==========================================");
		System.out.println("예금");
		System.out.println("==========================================");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");


	}

	// 4. 출금
	public static void withdraw() {
		System.out.println("==========================================");
		System.out.println("출금");
		System.out.println("==========================================");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");

	}

	// 5. accountArray 배열에서 ano 동일한 Account 객체 찾는 역할을 한다.
	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) { // null이 아니면 계좌가 있다.
				// 불러온 계좌안에 있는 계좌 번호와 매개변수로 받아온 계좌번호 ano가 같은지 체크
				String dbAno = accountArray[i].getAno();
				// string은 비교할 때 = 말고 equals를 사용해야한다.

				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
