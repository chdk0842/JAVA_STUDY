package Ring;

public class RingEx{
	public static void main(String[] args) {
       Ring myRing = new Ring();
       
       System.out.println("** 회원님의 반지 예상 견적은? ** \n");
       
       //Ring Type (type1) 객체 교체
       myRing.ringType = new SilverRing();
       
       //Stone Type (type2) 객체 교체
       myRing.stoneType = new RubyStone();
       
       
       //각자의 타입별로 예상 금액 실행
       myRing.type1();
       myRing.type2();
       
       //견적 합계
       myRing.priceSum();
     
      

  }
}
