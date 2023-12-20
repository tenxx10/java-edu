package chapter12;

public class Exercise4 {

	public static void main(String[] args) {
		// 아이디,이름,나이
		
		String [] member = {
				"hong,홍길동,30",
				"lee,이순신,40",
				"kim,김유신,50"
		};
		

		
		//이름만 출력
		// 코드 작성

		for(String cnt : member) {
			System.out.println(cnt.split(",")[1]);
		}	
		
		//인덱스 번호 적는 게 중요
		// 그냥 for 문
		
//		for (int i=0; i<member.length; i++) {
//			System.out.println(member[i].split(",")[1]);
//		}
//		
		
		//평균나이출력
		int ageSum = 0; //   합계/원소개수 
		for (String age : member) {   //합계를 구하기 위함 
			ageSum += Integer.parseInt(age.split(",")[2]);
			
		}
		
		
		System.out.println("평균나이 : "+(double)ageSum/member.length);
		
	}
}
