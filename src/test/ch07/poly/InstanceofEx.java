package test.ch07.poly;

public class InstanceofEx {

	public static void personInfo(Person person) {
		System.out.println("이름 : " + person.name);
		person.walk();
		
		//person이 student 타입을 참조하는 가
	    if (person instanceof Student){
			Student student = (Student) person;
			
			student.study(); //메소드를 불러온다.
			System.out.println(student.studentNo);
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);

		Person p2 = new Student("신초아", 10);
		personInfo(p2);
		
	}

}
