package chaper5;

public class AAA {
	public static void main(String[] args) {
		
		// 간단한 2차원 배열 별찍기
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println("");	
		}   
		System.out.println();

		// 삼각형 별찍기
		for (int i=1; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		
		// 삼각형 별찍기
		for(int i=1; i<5; i++) {
			for(int j=4; j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();

		
		
		
		
		
		
		
		
	}

}
