package chapter08;

public class Tiger extends Animal {
	
	Tiger(String type, String name) {
		super(type,name) ;
	}

	void sleep() {
		System.out.println(this.name+"는(은) 산속에서 잠을 잔다");
	}
}
