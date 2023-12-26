package chapter16;

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		
		String str = "자바세상을 만들자";
		
		//Stream 객체 생성
		IntStream isr = str.chars();
		
		isr.forEach(s -> System.out.print((char)s));
	}
}
