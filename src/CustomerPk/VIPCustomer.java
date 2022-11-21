package CustomerPk;

public class VIPCustomer extends Customer {
	//필드
	private int agentID; // 상담원 아이디
	double saleRatio; // 할인률

	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//오버라이드 메소드 소스 불러오기
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 아이디 : " + agentID;
	}
	
	//get 소스 불러오기
	public int getAgentID() {
		return agentID;
	}
	
	
	
}
