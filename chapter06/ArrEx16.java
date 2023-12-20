package chapter6;

public class ArrEx16 {
	public static void main(String[] args) {
		
		int [] arrInt = {1,2,3,4,5};
		
		//기존 for문을 이용한 출력
		for(int i=0; i<arrInt.length; i++) { 
			System.out.println(arrInt[i]);
			
		}
		System.out.println();
		for (int number : arrInt) {
			System.out.print(number);
		}
	}

}
