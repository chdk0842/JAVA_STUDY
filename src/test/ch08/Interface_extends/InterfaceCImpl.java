package test.ch08.Interface_extends;

public class InterfaceCImpl implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-A 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-B 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-C 실행");
		
	}

}
