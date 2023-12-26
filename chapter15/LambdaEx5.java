package chapter15;

public class LambdaEx5 {
	public static void main(String[] args) {
		// 메인구문
		
		Outer o = new Outer();
		o.method();
	}

}

@FunctionalInterface
interface LamdaInterface5 {
	void method(); 
	
	// 인터페이스니까 메소드 1개는 갖고 있어야함
}

class Outer {  //인터페이스 구현 클래스
	public int iv = 10;   // 변수
	
	void method () {
		final int iv = 40;    //메소드 변수 (지역변수임 클래스 안에서만 사용 가능)
		LamdaInterface5 f5 = () -> {   //인터페이스 구현을 클래스 메소드 안에서 하네
			System.out.println("Outer.this.iv : "+Outer.this.iv);   
			System.out.println("this.iv : "+this.iv);     
			System.out.println("iv : "+iv);     
		};
		f5.method();
	}
}
