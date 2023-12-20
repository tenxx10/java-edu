package chapter6;

public class Practice6 {
	public static void main(String[] args) {
		
		/* 문제 1번 
		 *  답 : 4번
		 */
		
		// 2번
		
		int[][] arr = {
				{1},
				{1,2},
				{1,2,3},
				{1,2,3,4}
		};
		System.out.println("arr의 길이 : "+arr.length);
		System.out.println("arr[2]의 길이 : "+arr[2].length);
		
		
		// 3번 합계점수와 평균점수를 출력하는 코드 완성하기
		
		int[] score = {90,80,60,100};
		int tatalScore = 0;     // 총합
		double avgScore = 0;    // 평균
		
//		for (int i; score) {
//			totalScocre +=i;
//		}   간단한 선생님 식
//		
		for(int i=0; i<score.length; i++) {    //스코어에 있는 배열을 토탈에다가 담을 예정임
			tatalScore += score[i];
		}
		avgScore = (double) tatalScore / score.length;
		
		System.out.println("total : "+tatalScore);
		System.out.println("avg : "+avgScore);
		
		
		
		
		//4번 제곱값 더하기
		
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int[10];
		
		// 코드 작성
		
		for (int i=0; i<num1.length; i++) {
			num2[i]=num1[i]*num1[i];    //제곱할땐 math.pow 쓰면 됨 
			
			
		}
		
		
		// num2 출력
		for (int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
