package chapter17;

public class ProcessEx {
	public static void main(String[] args) {
		
		try {
			//메모장 실행
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			//그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor();
			p2.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
