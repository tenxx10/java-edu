package chapter13;

import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		
		Vector <Double>list = new Vector<>();
		list.add(1.2);
		list.add(Math.PI);
		list.addElement(3.4);
		
		//향상된 for 문
		for (Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		//해당 요소의 인덱스 (없으면 -1)
		int index = list.indexOf(num);
		if (index >= 0) {
			System.out.println(num+"의 위치 : "+index);
		} else {  // 존재하지 않는 경우
			System.out.println(num+"은 list에 없습니다");
		}
		
		num = 1.2;
		// 값이 존재하는 지 확인
		if (list.contains(num)) {
			// 제거 remove (이전 메소드)
			list.removeElement(num);
			System.out.println(num+"삭제됨");
		}
		
		//해당요소의 인덱스(없으면 -1)
		System.out.println(list.indexOf(num));
		System.out.println(list);  // toString()
		
	}

}
