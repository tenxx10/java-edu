package chapter12;

public class ClassEx {
	public static void main(String[] args) {
		
		EnvEx env = new EnvEx();
		
		//객체를 이용해서 생성
		Class c1 = env.getClass();
		System.out.println(c1.getName());
		
		try {
			Class c2 = Class.forName("chapter12.EnvEx");
			System.out.println(c2.getName());
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
