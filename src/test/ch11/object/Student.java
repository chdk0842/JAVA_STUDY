package test.ch11.object;

public class Student {
   //필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("no : " + no + ", name : " + name.hashCode());
		int hashCode = no + name.hashCode(); 
		//번호하고 이름이 같으면 동일한 값이 생성이 된다.
	    return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
		   	Student target = (Student)obj; //강제 타입 변환
		   	if (no == target.getNo() && name.equals(target.getName())) {
		   		return true;
		   	}
		}
		return false;
	}
	
	
	
}
