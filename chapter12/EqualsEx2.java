package chapter12;

public class EqualsEx2 {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("str1객체와 str2객체는 같음");
		} else {
			System.out.println("str1객체와 str2객체는 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1문자열와 str2문자열은 같음");
		} else {
			System.out.println("str1문자열와 str2문자열은 다름");
		}
}
}