package chapter08;

public class Lion extends Animal {
	
	Lion (String type, String name) {
		super(type,name) ;
	}

	void sleep() {
		System.out.println(this.name+"는(은) 숲속에서 잠을 잔다");
	}
}
