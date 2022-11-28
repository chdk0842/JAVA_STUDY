package Ring;

public class GoldRing implements RingType {
    
	int price = 500000;

	@Override
	public void ringType() {
		System.out.println("GoldRing을 선택하셨습니다. 예상 금액은 " + price + "원 입니다.");
	}

	@Override
	public int price1() {
		return 500000;
	}



	


}
