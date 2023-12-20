package chapter04;

public class OpEx5 {
	public static void main(String[] args) {
		int a =10;
		int b = 5;
		
		//and 연산
		System.out.println(a >b && a == 10);
		System.out.println(a> b && a==b);
		// or 연산
		System.out.println(a>b || a == b);
		System.out.println(a<b || a==b);
		// XOR 연산
		System.out.println(a>b ^ a == 10);
		System.out.println(a> b ^ a== b);
		// NOT 연산
		System.out.println(!(a>b));
		System.out.println(!(a<b)); 
	}

}
 