package chapter09;

public class Exercise4 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() {
			
			@Override
			public void turnOn() {
				System.out.println("티비를 켭니다");
			}
		};
		
		tv.turnOn();
		
	}

}
