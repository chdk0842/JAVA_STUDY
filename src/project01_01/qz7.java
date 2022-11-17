package project01_01;

public class qz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		
//		for( int i = 1; i <= 100; i++ )  {
//			System.out.println(i);
//			if( i % 3 == 0) {
//				sum += i;	
//			}
//		}
//      System.out.println(sum);
      
      for( int i = 1; i <= 20; i++ )  {
//			System.out.println(i);
			if( !(i % 3 == 0 || i % 2 == 0)) {
				sum += i;	
			}
		}
    System.out.println(sum);
    
	}

}
