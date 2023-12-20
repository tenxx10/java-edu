package chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {
	public static void main(String[] args) {

		Map map = new HashMap();

		String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
		int [] nums = {1234, 4567, 2350, 9870, 2345};

		// map 객체에 key와 value값으로 저장
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		// Map객체는 (키,값) 쌍으로 이루어진 객체들의 모임 
		// 키, 값 쌍으로 조회하기
		Set entry = map.entrySet();
		for (Object o : entry) {
			Map.Entry m = (Map.Entry)o;
			System.out.println("key"+m.getKey()+", value : "+m.getValue());
		}
		
		
	}

}
