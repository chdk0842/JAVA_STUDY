package project01_03;

public class Calculator2 {
	
    //필드 
    static double pi = 3.14159;
    static String model = "calc1";
    static String number = "1";
    static String info;
    
    //static블록: static 필드에 대한 초기화 작업이 필요할 때 사용
    static {
    	 info = model + "_" + number; //calc1_1
    }
    
    
    //메소드
    static int plus(int x, int y) {
    	return x + y;
    	
    }
    static int minus(int x, int y) {
    	return x - y;
   
    }

}
