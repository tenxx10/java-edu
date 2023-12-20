package chapter08;

public class FinalMethod {
	
	//재정의 가능한 메소드
	void method() {
		
	}
	// 재정의 불가능한 메소드
	final void finalMethod() {
	
	}
}

class SubFinalMethod extends FinalMethod {
	
	void method() {
		System.out.println("method() 재정의");
	}
//	void finalMethod() { //  재정의 불가
//		System.out.println("finalMethod()재정의");
//	}
}
