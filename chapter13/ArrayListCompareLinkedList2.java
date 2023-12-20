package chapter13;


import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList2 {

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
		System.out.println("start:"+start);
		for (int i = 0; i<10000; i++) {
			alist.add(500,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("end:"+end);
		System.out.println(end-start); 
	
		
		
		
		// LinkedList
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			llist.add(500,i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
	}
	

}
