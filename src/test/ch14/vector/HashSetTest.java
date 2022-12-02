package test.ch14.vector;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>(); 아래랑 같음
		HashSet<String> set = new HashSet<String>();

		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);
		
		//set 순서를 유지하지 않고 중복저장이 안된다.
		
	};

}
