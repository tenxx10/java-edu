package chapter08;

public class Eagle extends Animal {
	
	Eagle(String type, String name) {
		super(type,name) ;
	}

	void sleep() {
		System.out.println(this.name+"는(은) 하늘에서 잠을 잔다");
	}
}
