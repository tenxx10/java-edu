package chapter15;

public class LamdaEx {
	public static void main(String[] args) {
		
	LamdaInterface li = () -> {
		String str = "메서드 출력";
		System.out.println(str);
	};
		
	li.print();
	}

}

interface LamdaInterface{
	void print();
//	void print2();
}
