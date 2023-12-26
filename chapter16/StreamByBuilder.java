package chapter16;

import java.util.stream.Stream;

public class StreamByBuilder {
	public static void main(String[] args) {
		
		//builder () 메서드로 빌더 객체 생성
		// add 메서드로 리턴타입이 빌더객체이므로 메서드 체이닝 가능

		Stream stream = Stream.builder()
				.add("무궁화")
				.add("삼천리")
				.add("화려강산")
				.add("대한사람")
				.build();
		
		//build 메서드로 Stream 객체 생성
		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s+" "));

		
		// generate () 메서드로 Stream 객체 생성
		//리미트 10개 생성
		Stream<String> stream1 = Stream.generate(()->"애국가").limit(10);
		
		//내부 반복자로 출력
		stream1.forEach(s -> System.out.println(s));
		
		
		
	}

}
