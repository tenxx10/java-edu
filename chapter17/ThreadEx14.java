package chapter17;

public class ThreadEx14 {
	public static void main(String[] args) {
	
		// 통장 객체 생성
		Account acc =new Account();
		
		//부모 스레드 객체
		Parent p =new Parent(acc);
		//자식스레드
		Child c = new Child(acc);
		
		p.start();
		c.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}

		c.interrupt();
		p.interrupt();

	}
}

class Account {
	//필드 선언
	int money;
	
	//출금 메서드
	synchronized void withdraw() {
		while(money == 0) {
			try {
				wait();   //0이 되면 기다리기
			} catch (InterruptedException e) {
				break;  //예외시 무한반복 구문 끝내기
			}
		}
		notifyAll();  //다른 스레드 깨우기
		System.out.println(Thread.currentThread().getName()+money+"원 출금");
		// 정보 불러와서 이름 가져오고 / 돈 가져오고 / 출금 프린트하기
		money = 0;   //돈이 0원됨. 그러면 위의 while 구문 마냥 wait 하는 거임
	}
	
	
	synchronized void deposit() {   //입금 메소드 만들기
		while(money > 0 ) {   //돈이 0보다 많을시
			try {
				wait();   // 기다리기.. 내 차례아님 (예외발생시키니까 try 구문 필수임
			} catch (InterruptedException e) {
				break;   // 예외시 무한반복 끝내기
			}
		}
		// 랜덤 입금
		System.out.println();  // 줄 바꾸기
		money = (int)((Math.random()*5)+1)*100000;  //10-50만원 랜덤 입금예정
		System.out.println(Thread.currentThread().getName()+money+"원 입금");   //알림 프린터
		notifyAll();    // 다른 스레드 깨우기
	}
	
}

class Parent extends Thread {  //스레드 상속클래스
	Account account;  // 다른 클래스 객체 가져오기

	Parent(Account account) {     // 변수 사용할 메서드 생성
		super("부모");    //이건 스레드 생성자 가져옴과 동시에 이름 생성
		this.account = account;   // 사용할 생성자
	}
	
	@Override
	public void run() {
		while(true) {   //무한반복문
			try {
				account.deposit();    //디파짓 메소드 가져옴 부모클래스에서 할 일.
				sleep((int)(Math.random()*2000));   // 랜덤숫자 0~2초 사이
			} catch (InterruptedException e) {
				break;   // 무한반복 탈출
			}
		}
	}
}


class Child extends Thread {
	Account account;
	
	Child(Account account) {
		super("자식");
		this.account = account;
	}

	@Override
	public void run() {
		while(true) {
			try {
				if (account.money > 0) {
					account.withdraw();
				} sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}











