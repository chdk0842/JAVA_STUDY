package test.ch09;

public class AStatic {
	
   static class B {
	   int field1 = 1;
	   
	   B(){
		   System.out.println("b생성자 실행");
	   }
	   void method1() {
		   System.out.println("b메소드 실행");
	   }
   }
   //
   B field = new B();
   //
   static B field2 = new B();
   //
   AStatic() {
	   B b = new B();
   }
   //
   void method1() {
	   B b = new B();
   }
   //
   static void method2() {
	   B b = new B();
			   
   }
   
}
