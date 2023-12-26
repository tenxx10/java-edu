package chapter17;

public class ThreadEx9 {
	public static void main(String[] args) {
		
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	
		}
		
		t1.isContinue = false;  //양보하는 거임
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		t1.isContinue = true; //다시 진행
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		// 스레드 종료
		t1.isBreak = true;
		t2.isBreak = true;
	}

}



class YieldThread extends Thread{
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while(!isBreak) {    //false 가 아닐 동안
			if (isContinue) {  // true라면
				System.out.println(getName()+" 실행중"); 
			} else {
				Thread.yield(); // 아닐시 대기상태
			}
		}
		System.out.println(getName()+"종료");   // 이해안감
	}
	
}
