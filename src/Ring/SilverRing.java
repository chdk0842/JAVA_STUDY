package Ring;

public class SilverRing implements RingType {
  
	int price = 300000;
	
	@Override
	public void ringType() {
		System.out.println("SilverRing을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
		
	}

	@Override
	public int price1() {
		return 300000;
	}



}
