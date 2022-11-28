package MiniTest01;

public class test02 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum =  0; //합

		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
	    int arg = sum/(arr.length);
	    
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + arg);

	}

}
