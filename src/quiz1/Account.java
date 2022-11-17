package quiz1;

public class Account {

	// 필드 (private을 쓰는 이유 외부에서 값이 바뀌면 안되기 때문)

	private String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고

	// 생성자 (처음에 잔고 초깃값 필요) 
	public Account(String ano, String owner, int balance) {
       this.ano = ano;
       this.owner = owner;
       this.balance = balance;
	}

	// get,set 함수 넣어야함 우클릭 소스부르기
	// 매소드
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
