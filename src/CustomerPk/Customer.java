package CustomerPk;

public class Customer {
	// 필드
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 포인트 적립
	double bonusRatio; // 포인트 적립 비율
	
	// 생성자
	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// 메소드
	
	// 고객 등급 초기화
	private void initCustomer() {
		//고객 등급, 포인트 적립비율 초깃값 주기
		this.customerGrade = "SILVER"; // 매개변수로 받을 때는 this 필수지만 여긴 아님.
		bonusRatio = 0.01;
	}
	
	//보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) { //price: 지불금액
		bonusPoint += (price * bonusRatio); //보너스 비율을 계산해서 보너스 포인트를 적립해준다.
		return price; //일반고객은 할인률이 없어서 지불금액 그대로 리턴
	}
	
	//고객정보 보여주기
	public String showCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint + "점"; 
	}
	
	//get,set 메소드 소스 불러오기
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
}
