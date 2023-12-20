package chaper5;


public class Practice_5 {
	public static void main(String[] args) {
		
		// 1번문제
		
		int sum = 0;
		
		//for 문을 이용하여 반복 합계 연산
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}

		} System.out.println("5의 배수의 합계는 "+sum);  // 여기서 빼야 합계만 나옴 안에서 하면 전부 반복됨

		
		// 2번 
		int evenSum = 0;
		int oddSum = 0;
		
		// for 문을 이용하여 반복 합계연산
		for (int i=1; i<=100; i++) {
			if (i%2 ==0) {   //짝수얘기
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계는 "+evenSum);
		System.out.println("홀수의 합계는 "+oddSum);
		
		
		// 3번 주사위 합
		
		for (int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y==6) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

		// 4번
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {  //j++은 크게 안중요함 j<i    i가 3이 되면 j가 3이 되어 별찍고 종료하고, 다음으로 넘어감
				System.out.print("*");
			}System.out.println("");     // 바깥 for문이 하는 거 -> 줄 바꿈 ㄷㄷ 안for 하면 그 다음 바깥 for
		}
		
		System.out.println();

		// 5번
		for (int i = 5; i>=1; i--) {     // 차이점 5에서 1이 되는거 반복 i--로 1개씩 줄어듦
			for(int j = 1; j<=i; j++) {    // j는 i가 5니까 1부터 i될때까지 별이 5개 찍히는거임 반복하는거.
				System.out.print("*");            
			} System.out.println("");     // j의 반복이 끝나면 바깥 for문
		}

		// 6번
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 5 - i; j > 0; j--) {     //별찍기와 동일
		        System.out.print(" ");          // 트리모양 만들기 위해 위에서부터 공백 찍어주기 공백 4-3-2-1
		    }
		    for (int k = 1; k <= i * 2 - 1; k++) {    // 별이 1,3,5,7,9로 
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		
		int num = 1;
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 5 - i; j > 0; j--) {     //별찍기와 동일
		        System.out.print(" ");          // 트리모양 만들기 위해 위에서부터 공백 찍어주기 공백 4-3-2-1
		    }
		    for (int k = 1; k <= num * 2 - 1; k++) {    // 별이 1,3,5,7,9로 
		        System.out.print("*");
		    }
		    num=num+2;
		   
		    System.out.println("");
		}

		
		// 7번
//		int tot = 0;       // 이거 내가 한거
//		int i = 1;
//
//		while (i <= 6) {
//			System.out.println("(" + i + ")");
//			tot += i;
//
//			if (i == 6) {
//				break;
//			}
//
//			i++;
//		}
//
//		System.out.println("총 주사위 굴린 횟수는: " + tot);

		// 7번 답지
		
		int count = 0;
		while(true) {       //무한반복
			int dice = (int)(Math.random()*6)+1;
			
			System.out.println("("+dice+")");
			count++;
			
			if (dice==6) {
				break;
			}
		}
		System.out.println("총 주사위 굴린 횟수는: "+count+"회");
		
	}
}

