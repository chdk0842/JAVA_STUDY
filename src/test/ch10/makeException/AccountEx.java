package test.ch10.makeException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(); //계좌생성
		
		//저축
		account.deposit(10000); //만원저축
		System.out.println("예금액 : " + account.getBalance()); //잔고 가져옴

		//출금
		try {
			account.withdraw(30000);  //3만원 출금
		} catch (InsuffException e) {
			String message = e.getMessage();
			System.out.println(message);
		} 
	}

}
