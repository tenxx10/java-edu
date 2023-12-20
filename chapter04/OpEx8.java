package chapter04;

public class OpEx8 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println("안녕하세요. "+name+"입니다.");
		
		int height = 180;
		System.out.println("저의 키는 "+height+"입니다.");
		
		// String weight = 75.5; // 에러발생(문자형 자료형에는 숫자대입 못함
		String weight = 75.5+"";
		System.out.println("제 몸무게는 "+weight+ "입니다.");
		
		int ageInt = 30;    //정수 int
		String ageStr = "30";  // 문자열 String
		
	}

}
