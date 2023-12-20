package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		//이름이 담긴 문자열 배열 생성
		String [] names = {"홍길동","김유신","이순신","강감찬","김유신"}; 
		// 번호가 담긴 정수 배열 생성
		int [] nums = {1234, 4567, 2350, 9870, 2345};
		
		//Map 객체에서 key들만 조회하기
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "=" +map.get(key));
			System.out.println("Iterator로 출력");
			Iterator it = keys.iterator();
			while (it.hasNext()) {
				String a = (String)it.next();
				System.out.println(a+"="+map.get(a));
			}
		}
		
		
	}

}
