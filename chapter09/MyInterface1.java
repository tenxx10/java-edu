package chapter09;

public interface MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MtInterface1의 default 메소드");
	}

	static void staticMethod() {
		System.out.println("MyInterface1의 static 메소드");
	}
}
