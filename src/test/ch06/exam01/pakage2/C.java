package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;


public class C {
	public C() {
		A a = new A();
		
		a.field1 =1;
//	 	a.field2 =1;
//	 	   a.field3 =1; 
	 	   //실행 안됨 private은 같은 클래스 안에서만 가능
	 	   
	 	a.method1();
//	 	a.method2();
//	 	   a.method3(); 
	 	  //실행 안됨 private은 같은 클래스 안에서만 가능
	}
}
