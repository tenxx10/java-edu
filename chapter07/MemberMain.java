package chapter07;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m객체는 m2객체와 같다");
		} else {
			System.out.println("m객체는 m2객체와 같지않다");
		}
		
		}
	
	}
