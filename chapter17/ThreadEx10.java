package chapter17;

public class ThreadEx10 {
	public static void main(String[] args) {
		
		
		// 게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		
		//플레이어1 객체 생성 후 스레드 실행 
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();   //스레드니까 start 실행해야 재정의 해준 run() 메소드가 실행이 됨
		
		
		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
	}

}


//스마트폰게임 클래스
class SmartPhoneGame {
	private int level; //레벨 변수
	
	public int getLevel() {    //this.level을 사용하기 위한 메소드 생성
		return this.level;
	}
	
	public synchronized void increaseLevel() {  // 레벨 증가시켜줄 메소드 생성
		while(true) {
			this.level++;   //this.level 레벨 1씩 증가시켜주기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName()+"Level : "+this.level);
			
			//레벨이 10의 배수가 되면 종료
			if (this.level % 10 == 0) break;  //한줄 출력
		}
	}
	
	
}


//플레이어 1 스레드 상속 클래스 생성

class Player1 extends Thread {
	private  SmartPhoneGame game; 
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}



// 플레이어 2 스레드 상속 클래스 생성

class Player2 extends Thread {
	private  SmartPhoneGame game; 
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
		
	}
}






