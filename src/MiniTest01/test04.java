package MiniTest01;


public class test04 {

	public static void main(String[] args) {
	 
	}
	
	public class Student {
		
		String name; // 학생이름 
		int ban; //반
		int no; //번호
		int kor; //국어점수
		int eng; //영어점수
		int math; //수학점수
		
		
		@Override
		public String toString() {
			return name + ban + no;
		}

		
		public int getTotal() {
			return kor + eng + math;
			
		}
		
		public float getAverage() {
			return Math.round(getTotal() / 3 * 100)/100;
		}
		
		}

	
}
