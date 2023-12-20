package chapter13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {

		//HashSet 객체 생성 
		Set<Object> set = new HashSet<Object>();

		//문자열 객체 두 개 추가
		set.add(new String("abc"));
		set.add(new String("abc"));


		//member 객체 두 개 추가 (사용자 정의 클래스)
		set.add(new Member("홍길동",40));
		set.add(new Member("고길동",40));

		System.out.println(set);
	}
}
