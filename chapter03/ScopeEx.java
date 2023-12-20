package chapter03;

public class ScopeEx { // 1. 클래스 블럭
	int no; //1-1 클래스 블럭 내에서 사용 가능한 변수
	public static void main(String[]args) {
		
		String name; // 2-1 main 메서드 블럭내에서 사용 가능한 변수

		if (true) {
			// 메서드 블럭 안에서 선언한 변수 사용 가능
			name = "홍길동" ;

			//if문 블럭안에서 변수 선언
			String email = "hong.test.com";

		}
		// if 문 블럭 밖에서 email 변수를 사용하면 에러 발생
//		email = "hong@test.com";
	}

}

// 클래스 변수를 메소드 블럭에서 사용한 예시

//public class ScopeEx {
//    int no; // 클래스 블록 내에서 사용 가능한 변수
//
//    public static void main(String[] args) {
//        ScopeEx obj = new ScopeEx();
//        obj.no = 10; // 클래스의 인스턴스를 생성하여 멤버 변수에 접근
//        System.out.println(obj.no); // 출력: 10
//    }
//}
