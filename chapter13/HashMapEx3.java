package chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;

public class HashMapEx3 {
	public static void main(String[] args) {
		
Map map = new HashMap();
		
		String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
		int [] nums = {1234, 4567, 2350, 9870, 2345};
		
		// map 객체에 key와 value값으로 저장
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//Map 객체에서 value들만 조회하기
		Collection values = map.values();
		
		// 향상된 for문으로 출력
		for (Object i : values) {
			System.out.println(i);
		}
		
		//Iterator 객체로 출력
		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
