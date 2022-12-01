package singtone;


public class User {
   //사용자 이름 필드
   private String name;
   
   public User(String name) {
	   this.name = name;
   }
   
   public void print() {
	   Printer printer = Printer.getPrinter();
	   //print.tostring() 객체의 주소 보여줌
	   System.out.println(this.name + "사용자가 사용하는 프린트 : " + printer.toString());
   }
}
