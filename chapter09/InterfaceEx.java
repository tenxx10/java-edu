package chapter09;

public interface InterfaceEx {
	
	//상수
	public int Min_PRICE = 0;
	public int MAX_PRICE = 100000;

	//추상 메서드
	public double meanPrice();
	public double totalPrice();
	
	//default 메서드(구현부 작성)
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}
	
	// static 메서드
	static void printPrice(double price) {
		System.out.println(price);
	}
	
}
