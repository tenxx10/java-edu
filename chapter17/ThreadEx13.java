package chapter17;

public class ThreadEx13 {
	public static void main(String[] args) {
		
		ThreadGroup group = new ThreadGroup("Group1");
		
		MyThread m1 = new MyThread(group, "First");
		MyThread m2 = new MyThread(group, "Second");
		MyThread m3 = new MyThread(group, "Third");
		
		m1.start();
		m2.start();
		m3.start();
		
		//일반 스레드
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		group.interrupt();
	}

}

class MyThread extends Thread {
	
	MyThread(ThreadGroup group, String name){
		super(group, name) ;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(getName());
		try {
			sleep(500);
		} catch (InterruptedException e) {
			System.out.println(getName()+" interrupted 발생");
			break;
		}
		} 
		
		System.out.println(getName()+"종료");
	}

}