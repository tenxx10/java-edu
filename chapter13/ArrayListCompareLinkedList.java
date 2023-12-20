package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList {
	
	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList(); 
		LinkedList llist = new LinkedList();
		
		for(int i=0; i<100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		//ArrayList
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		for (int i = 0; i<alist.size(); i++) {
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start); 
		// 최종시간 - 시작시간? 왜 ArrayList는 long을 사용했는지
		
		
		
		// LinkedList
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for (int i=0; i<llist.size(); i++) {
			llist.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
	}
	

}
