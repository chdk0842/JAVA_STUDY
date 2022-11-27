package Ring;

public class RubyStone implements StoneType{
    
	int price = 500000;
	
	@Override
	public void stoneType() {
		System.out.println("RubyStone을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
		
	}

}
