package test.ch09;

public class A {
	//인스턴스 멤버 클래스
	//public, default, private 접근 제한자 사용가능
   class B {
	   int field1 = 1;
	  
	   B(){
		   System.out.println("B 생성자 실행");
	   }
	   
	   void method1() {
		   System.out.println("B의 메소드 실행");
	   }
   }
   /*
   //필드로 만들기
   B field = new B() ;
   
   //A클래스 생성자에서 사용 가능
   A(){
	   B b = new B();
   }
   
   //메소드에서 사용 가능
   void method() {
	   B b = new B();
   }
   */
   
   void useB() {
	   B b = new B();
	   System.out.println(b.field1);
	   b.method1();
   }
   
}
