package chapter16;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <100 ; i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		//Stream 순차적 스트림 처리
		list.stream().forEach(a-> {
			try {
				Thread.sleep(1);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		});
		
		long end = System.nanoTime();
		System.out.println("순차적 스트림 처리 시간 : "+(end- start)+"nano sec");
		
		
		start = System.nanoTime();
		//ParallelStream 순차적 스트림 처리
		list.parallelStream().forEach(a->{
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		end = System.nanoTime();
		System.out.println("parallel 스트림 처리 시간 : "+(end- start)+"nano sec");
		
		
	}
}
