package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamOptionalNoElem {
	public static void main(String[] args) {
		
		//요소가 없는 빈 ArrayList 생성
		List <Integer> list = new ArrayList<>();
		
		long count = list.stream().count();
		System.out.println("요소들의 개수 :"+count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : "+sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		if(avg.isPresent()) {
			System.out.println("요소들의 평균 : "+avg.getAsDouble());
		}
		
		// 요소값이 없는 경우 기본값 설정
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최댓값 : "+ max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최솟값 : "+min);
		
		// 요소가 존재하면 실행
		list.stream().mapToInt(Integer::intValue).findFirst()
		.ifPresent(a -> System.out.println("요소 중 첫번째 값 :"+a));
		
	}

}
