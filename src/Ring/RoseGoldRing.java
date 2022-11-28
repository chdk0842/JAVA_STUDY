package Ring;

public class RoseGoldRing implements RingType{
    
	int price = 400000;
	
	@Override
	public void ringType() {
		System.out.println("RoseGoldRing을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
		
	}

	
}
