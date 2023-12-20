package chapter13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Object [] arr = {"홍길동","이순신","홍길동","이순신", "1","2",1,2};
		
		//HashSet
		Set<Object> set = new HashSet<>();
		
		//set 객체에 배열의 모든 요소 add
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
		}

}
