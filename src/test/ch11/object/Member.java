package test.ch11.object;

public class Member extends Object {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	//논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member target = (Member)obj; //강제형변환
			
			if (id.equals(target.id)) { //순수하게 문자값 비교
				return true;
				
			}
		}
		
		return false;
	}

	{

	}
}
