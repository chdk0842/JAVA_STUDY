package quiz;

public class Example2 {

	public static int max(int[]arr) {
		//만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.		
				
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		
		
		int maxNum = arr[0];
		
		//최대값 : 하나씩 비교
		for (int i = 1; i <arr.length; i++) {
			if ( maxNum < arr[i]  ) {
				 maxNum = arr[i];
			}
			
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		int [] data = { 3,2,9,4,7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); //크기가 0인 배
		
		

	}

}
