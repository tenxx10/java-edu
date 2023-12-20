package chapter6;

public class ArrEx1 {
	public static void main(String[] args) {
		
//		int [] arrInt;
//		int arrInt2[] = null;
//		
//		System.out.println(arrInt[0]); // 에러발생
//		System.out.println(arrInt2[0]); // 에러발생하지않음

		int [] arrInt = new int[5];

		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;

		System.out.println(arrInt[0]);
 	}

}
