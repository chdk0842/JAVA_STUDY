package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
public class A {
   public int field1;
   int field2;
   private int field3;
   
   public A() {
	   field1 =1;
	   field2 =1;
	   field3 =1;
	   
	   method1();
	   method2();
	   method3();
   }
   
   public void method1() {}
   void method2() {}
   private void method3() {}
   
   
}
