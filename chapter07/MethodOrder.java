package chapter07;

public class MethodOrder {
	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		
		me.one();
		
	}

}

class MethodEx {
	
	void one() {
		two();
		System.out.println("one");
	}
	
	void two() {
		three();
		System.out.println("two");
	}
	
	void three() {
		System.out.println("three");
	}
}

