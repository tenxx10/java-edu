package chapter13;


import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		
		List <Integer>list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);   // toString 자동 메소드
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i)); // 인덱스 번호 가져오는 get 메소드
		}
		
	
	}

}
