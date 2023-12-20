package chapter10;

public class Exercise {
	public static void main(String[] args) {
		
		//name 작성 코드
		Out out = new Out();
		Out.In in = out.new In(); 
		
		System.out.println(in.name);
		
	}

}

class Out{
	class In{  // 인스턴스 내부 클래스
		String name = "자바";
	}
}