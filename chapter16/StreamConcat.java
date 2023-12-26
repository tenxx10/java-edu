package chapter16;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		
		// 문자열 스트림 객체
		Stream <String > stream1 = Stream.of("홍길동","유관순","김유신","이순신");	
		
		// 정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,3,4,5);
		
		//concat 메서드로 두 스트림 객체
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(s -> System.out.print(s + ", "));
		
	}
}
