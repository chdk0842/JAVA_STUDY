package project01_02;


public class WeekEX {

	public static void main(String[] args) {
		Week today = null;
		
		Calenar cal = Calenar.getInstance();
		
		//요일을 숫자로 얻는다.
		int week = cal. get(Calenar.DAT_OF_WEEK);
		
		switch(week) {
		case 1:today = Week.SUNDAY; break;
		case 2:today = Week.MONDAY; break;
		case 3:today = Week.TUSEDAY; break;
		case 4:today = Week.WEDNESDAY; break;
		case 5:today = Week.THURSDAY; break;
		case 6:today = Week.FRIDAY; break;
		case 7:today = Week.SATURDAY; break;
		}

	  if(today == Week.SUNDAY) {
		  System.out.println("일요일 입니다.");		  
	  }else {
		  System.out.println("일요일이 아닙니다.");
	  }
	  
	}

}
