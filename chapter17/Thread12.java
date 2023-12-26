package chapter17;

public class Thread12 {
	public static void main(String[] args) {
		
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		
		d1.setDaemon(true);
		d2.setDaemon(true);
		
		d1.start();
		d2.start();
		
		//일반 스레드 실행
		try {
			Thread.sleep(5000);    //그냥 쓸 경우에는 항상 Thread.sleep이라고 붙여줘야함
		} catch (InterruptedException e) {
			
		}
		System.out.println("main 종료");
		
	}

}

class DaemonThread extends Thread {
	public void run() {
		while (true) {
			System.out.println(getName());
			try {
				sleep(500);  //0.5초 간격
			} catch (InterruptedException e) {
			}  // 데몬 설정 할거라서 굳이 break 설정 안함
		}
	}
}
