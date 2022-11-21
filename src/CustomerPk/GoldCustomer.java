package CustomerPk;

public class GoldCustomer extends Customer{
    //필드
	double saleRatio; //할인률

	//생성자
	public GoldCustomer(int customerID, String customerName) {
       super(customerID, customerName);
       super.customerGrade = "Gold";
       super.bonusRatio = 0.02;
       this.saleRatio = 0.1;
	}
	
	//오버라이드 메소드 소스 불러오기
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio); //할인금액 리턴
	}
	

}
