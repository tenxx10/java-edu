package chapter17;

public class Exercise4 {
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(()->{   //람다식으로 구현
			System.out.println("t1 스레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t1 : "+i);
			}
		});
		
		Thread t2 = new Thread(()->{   //람다식으로 구현
			System.out.println("t2 스레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t2 : "+i);
			}
		});
		
		
		// 우선 순위 지정
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		
		t1.start();
		t2.start();
		
	}

}
