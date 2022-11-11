package project01_02;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] season = {"Spring","Summer","Fall","Winter"};
      
      System.out.println(season[0]);
      System.out.println(season[1]);
      System.out.println(season[2]);
      System.out.println(season[3]);
      
     season[1] = "여름";
     System.out.println(season[1]);
     System.out.println();
     
     int[] scores = {83, 90, 87};
     
     int sum = 0;
     for (int i = 0; i < 3; i++) {
    	 sum +=scores[i];
     }
     double avg = (double) sum/3;
     System.out.println("총합 =" +sum +"평균 =" +avg );
	}

}
