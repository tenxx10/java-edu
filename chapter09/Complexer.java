package chapter09;
// 구현 클래스임.
public class Complexer implements Printer, Scanner, Fax{
	
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER+"에서 "+tel+"로 Fax 전송");
		
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel+"에서 "+FAX_NUMBER+"로 Fax 수신");
	}
	
	@ Override
	public void scan() {
		System.out.println("스캔 실행");
	}
	
	@Override
	public void print() {
		System.out.println("출력 실행");
	}
	
}
