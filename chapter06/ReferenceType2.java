package chapter6;

public class ReferenceType2 {
	public static void main(String[] args) {
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1 == name2);    //false
		
		
		System.out.println(name1.equals(name2));   // true
	}

}
