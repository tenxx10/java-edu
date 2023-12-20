package chapter07;

public class InitEx2 {
	
	//static 변수
	static int sVar;
	//static 메서드
	static void sMethod(){
		
	
	}
	
	//인스턴스 변수
	int var;
	//인스턴스 메서드
	void method() {
	
	}
	
	//static 초기화 블럭
	static {
		sVar=0;
		sMethod();
		
//		// 에러 (인스턴스 변수, 메서드 사용불가)
//		var = 0;
//		method();
//		
	}
	
	//static 메서드
	static void sMethod2() {
		
//		//에러
//		this.sVAr =0;
//		this.sMethod2();
	}
	
	
	
	
	
	
	
	
	
	
	

}
