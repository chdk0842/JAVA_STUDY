package test.ch14.vector;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
//		 Map<> map = new HashMap<>();
		//HashMap<key, 객체(저장할 값)> 
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("신초아",85);
		map.put("신태민",90);
		map.put("신희주",80);
		map.put("신쪼끄",95);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		//키로 값 얻기
		String key = "신초아";
		int value = map.get(key);
		System.out.println("점수 : " + value);

	}

}
