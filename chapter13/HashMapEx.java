package chapter13;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
		int [] nums = {1234, 4567, 2350, 9870, 2345};
		
		// map 객체에 key와 value값으로 저장
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		// 출력
		System.out.println(map);
		System.out.println("홍길동 번호 : "+map.get("홍길동"));
		System.out.println("이순신 번호 : "+map.get("이순신"));
		System.out.println("김유신 번호 : "+map.get("김유신"));
		System.out.println("강감찬 번호 : "+map.get("강감찬"));
		
		
		
		
		
		
		
	}

}
