package chapter07;

public class StudentMain {
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student("홍길동");
		Student stu3 = new Student("홍길동",4);
		Student stu4 = new Student("홍길동",4,"소프트웨어공학과");

		
//		System.out.println(stu.name);
//		System.out.println(stu.grade+"학년");
//		System.out.println(stu.department);
//		
//		Student stu2 = new Student("이순신",3,"디자인");
//		
		System.out.println(stu2.name);
		System.out.println(stu2.grade+"학년");
		System.out.println(stu2.department);
//		
//	}
//	
//	Student stu0 = new Student();
	}
}
