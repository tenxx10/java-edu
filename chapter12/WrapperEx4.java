package chapter12;

public class WrapperEx4 {
	public static void main(String[] args) {
		
		int i =10;
		
		//기본형을 참조형으로 변환(변환 생략 가능)
		Integer intg = (Integer)i;
		//Integer intg = Integer.valueOf(i)
		
		Long lng = 10L;
		int i2 = intg+10; // 참조형과 기본형간의 연산 가능 (10+10 = 20
		long l = intg+ lng; // 참조형간의 덧셈 가능 (10+10 = 20
		System.out.println("i2="+i2);
		System.out.println("l="+l);
		
		Integer intg2 = new Integer(30);
		int i3 = (int)intg2; // 참조형을 기본형으로 변환(생략가능) 
		System.out.println("i3="+i3) ;
		
		
	}

}
