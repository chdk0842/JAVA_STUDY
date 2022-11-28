package Ring;

public class Ring{
	
	RingType ringType;
	StoneType stoneType;
	

	
    void type1() {
       ringType.ringType();
    }
    
    
    void type2() {
       stoneType.stoneType();
    }
    
//    void price1() {
//    	System.out.println(ringType.price1());
//    }
//    
//    void price2() {
//    	System.out.println(stoneType.price2());
//    }
//  
    
    //견적 합계 계산 및 출력
    void priceSum() {
    	
    	System.out.println( "\n** 예상 견적 " + (ringType.price1() + stoneType.price2()) + "원 입니다 **");
    }
    
	

}
