package quiz03;

public class qz5 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;

		// 1번
//        double area = (lengthTop+lengthBottom) * height / 2.0 ; 

		// 2번
//        double area = (lengthTop+lengthBottom) * height * 1.0 / 2;

		// 3번
//		double area = (double)(lengthTop+lengthBottom) * height / 2 ;

		// 4번
	    double area = (double)((lengthTop+lengthBottom) * height / 2);
		
		
		System.out.println(area);
	}

}
