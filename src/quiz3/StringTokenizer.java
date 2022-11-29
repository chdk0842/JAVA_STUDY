package quiz3;

import java.util.StringTokenizer;

public class StringTokenizer {

	public static void main(String[] args) {
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
