package Ring;

public class DiaStone implements StoneType{
    
	int price = 800000;


	@Override
	public void stoneType() {
		System.out.println("DiaStone을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
	}
	
	

}
