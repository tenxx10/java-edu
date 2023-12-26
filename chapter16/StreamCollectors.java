package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class StreamCollectors {
	public static void main(String[] args) {
		
	
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		
		//요소가 Rectangle 객체인 경우 collect 메서드로 List 변환
		List<Shape> rectList = list.stream().filter(s-> s instanceof Rectangle).collect(Collectors.toList());
		rectList.stream().forEach(f -> System.out.println(f));
		System.out.println();
		
		// 요소가 Rectangle 객체인 경우 collect 메서드로 set으로 변환
		Set<Shape> rectSet = list.stream().filter(s-> s instanceof Rectangle).collect(Collectors.toSet());
		rectSet.stream().forEach(f -> System.out.println(f));
		
	}
}
