package quiz;

public class Account {
	private int balance; //잔고
	   
	   public static final int MIN_BALANCE=0;
	   public static final int MAX_BALANCE=1000000;
	   
	   public int getBalance() {
	      return balance;
	   }
	   
	   //get은 값을 가져오는 것
	   //set은 값을 설정하는 것	
	   
	   public void setBalance(int balance) {
	      //1. 0 <= balance =< 1,000,000 범위 일때 this. balance = balance;
		   
		   if(MIN_BALANCE <= balance || balance <= MAX_BALANCE) {
			   this.balance = balance;
			   System.out.println("1"); //리턴값 확인하기 위해
		   }else {
	         return;
		   }
		 
	   }

	   
	   //static final (상수) =변하지 않고 어디서든 사용가능하다. (대문자, 스네이크 사용)


	}


