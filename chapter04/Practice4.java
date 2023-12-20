package chapter04;

public class Practice4 {
	public static void main(String[] args) {
		
		/* 1번
		 *  1-1 : += 왼쪽 변수에 오른쪽 값을 플러스 대입해서 계산
		 *  1-2 : -= 왼쪽 변수에 오른쪽 값을 마이너스 대입해서 계산
		 *  1-3 : %= 왼쪽 변수를 오른쪽 값으로 나눴을때 그 나머지의 값을 보여줌
		 *  
		 */
		
		// 2번 코드의 실행결과 작성
		int var = 7 - 1 *20 / 5;
		System.out.println(var); // 3
		
	
		// 3번 
		int colorPen = 5 * 12 ;
		int studentCount = 27;
		int divColorPen = colorPen / studentCount ;
		System.out.println("학생당 나눠가지는 색연필수: "+divColorPen);
		
		int remainColorPen = colorPen % studentCount;
		System.out.println("똑같이 나눠가지고 남은 볼펜수 :"+remainColorPen);
		
		
		//4번 놀이동산 age, height, parent, hearchDease 
		int age = 6;
		int height = 120;
		boolean hearchDease = false;
		
//		((age>= 6 && height >= 120)|| (height >= 120 && parent == true)) && hearchDease==false;
		
		System.out.println(age+"세 이상 탑승가능(단, 키가 "+height+"이상이면 보호자 동반하에 탑승가능)");
		System.out.println("키"+height+"이상 탑승 가능");
		System.out.println(hearchDease+" :심장관련 질환자 탑승 불가");
		
	
		// 5번 윤년 조건
		
		int year = 2020;
		boolean leapYear = (year % 400==0) || (year % 4==0 && year % 100 != 0);
		System.out.println(leapYear);    // true
		
		// 윤년이면 true, 아니면 false
		
		
		// 6번 금액 지불
		
		int price = 187000;
		int oman = price / 50000;
		price = price % 50000;
		int ilman = price / 10000;
		price = price % 10000;
		int ochun = price / 5000;
		price = price % 5000;
		int ilchun = price / 1000 ;
		price = price % 1000;
		
		System.out.println("5만원권 : "+oman+"장");
		System.out.println("1만원권 : "+ilman+"장");
		System.out.println("5천원권 : "+ochun+"장");
		System.out.println("1천원권 : "+ilchun+"장");
		
		
		// 7번 정수타입에서 10자리 이하버리기 (나누기, 몫 이용하는 법)
		
		int number = 1234;
		int result = number - (number % 100);
		
		int number2 = 123;
		int result2 = number2/100*100;
		
		
		System.out.println(result);
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
	}

}
