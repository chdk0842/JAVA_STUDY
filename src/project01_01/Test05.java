package project01_01;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("45 & 25 = " + (45&25));
   System.out.println("45 & 25 = " + (45|25));
   System.out.println("45 & 25 = " + (45^25));
   System.out.println("~45 = " + (~45));
   System.out.println("----------------------");
   
   byte recieveData = -128;
   int unsignedInt = Byte.toUnsignedInt(recieveData);
   System.out.println(unsignedInt);

	}

}
