package Ring;

public class SapphireStone implements StoneType {
    
	int price = 600000;
	
	@Override
	public void stoneType() {
		System.out.println("SapphireStone을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
		
	}

	@Override
	public int price2() {
		return 600000;
	}

}
