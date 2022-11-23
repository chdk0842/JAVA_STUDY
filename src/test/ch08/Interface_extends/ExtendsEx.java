package test.ch08.Interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
	   InterfaceCImpl impl = new InterfaceCImpl();
	   InterfaceA ia = impl; //자동형변환
	   ia.methodA();
	   
	   InterfaceB ib = impl; //자동형변환
	   ib.methodB();
	   
	   InterfaceC ic = impl; //자동형변환
	   //interfaceC는 a와 b를 상속 받았으므로 아래와 같이 호출 가능
	   ic.methodA();
	   ic.methodB();
	   ic.methodC();
	}

}
