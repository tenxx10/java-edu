package chapter10;

public class LocalInnerEx {
	int i = 10;  // 바깥 클래스 멤버 변수
	
	void outerMethod() {
		class Inner {
			int x =20;
			int i =30;
			void innerMethod() {
				System.out.println(x);
				System.out.println(i);
				System.out.println(this.i);
				System.out.println(LocalInnerEx.this.i);
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}

}
