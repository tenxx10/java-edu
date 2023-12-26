package chapter17;


public class Exercise2 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("스레드 시작");
				for (int i = 0; i < 50; i++) {
					System.out.println(i);
				}
			}
		});
		
		t1.start();

	}
}