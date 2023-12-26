package chapter16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {
	public static void main(String[] args) {
		
		
		
		int [] arr = new int[100]; 
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1; 
		}
		
		//리턴값 long
		
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : "+count);
		
		//리턴값 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 :"+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : "+first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최댓값 : "+max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최솟값 : "+min.getAsInt());
		
		//리턴값 double
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균값 : "+avg.getAsDouble());
		

		
		
	}

}
