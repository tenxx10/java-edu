package chapter11;

public class ExceptionEx7 {
	public static void main(String[] args) throws Exception{
		
		try {
			first();
		} catch (Exception e) {
			System.out.println("main() 예외처리");
			System.out.println(e.getMessage());
			throw e;
		}
	}
		
//		try {
//			first();
//		} catch(Exception e) {
//			System.out.println("main() 예외처리");
//			System.out.println(e.getMessage());
//		}
//	}

	static void first() throws Exception{
		try {
			second();
		} catch (Exception e) {
			System.out.println("first() 예외처리");
			throw e; // 예외 재발생
		}
	}
	
	static void second() throws Exception{
		try {
			throw new Exception("예외 발생");
		}catch (Exception e) {
			System.out.println("second() 예외처리");
			throw e; // 예외 재발생
		}
	}
}


 
