package chapter15;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;


public class LambdaEx8 {
	
	static Student [] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신",95,70,"통계")
	};    // 생성자 static 배열 생성

	
	public static void main(String[] args) {
		
		System.out.print("학생명 : ");
		printString(t ->t.getName());
		System.out.print("전공 : ");
		printString(t ->t.getMajor());
		System.out.print("영어점수 :");
		printInt(t ->t.getEng());
		System.out.print("수학점수 : ");
		printInt(t ->t.getMath());
		System.out.print("영어점수 합계 :");
		printTot(t ->t.getEng());
		System.out.print("수학점수 합계: ");
		printTot(t ->t.getMath());
		System.out.print("영어점수 평균 :");
		printAvg(t ->t.getEng());
		System.out.print("수학점수 평균 : ");
		printAvg(t ->t.getMath());
		
		
		
	}
	
	// 실행할 메소드 생성
	
	static void printAvg(ToDoubleFunction <Student> f ) {   //<타입>을 Double 로 바꿈
		double sum = 0;
		for (Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);   //총합 나눠서 평균 내기
		
	}
	
	static void printTot(ToIntFunction<Student> f ) {   //<타입>을 Double 로 바꿈
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);   //총합 
		
	}
	
	static void printInt(Function<Student, Integer> f ) {
		for(Student s : list) {
			System.out.print(f.apply(s)+", ");    //점수 , 연달아 내기 print 로 사용함
		}
		System.out.println();   // 줄바꿈
	} 
	
	static void printString(Function<Student, String> f ) {
		for(Student s : list) {
			System.out.print(f.apply(s)+", ");    //학생명 , 연달아 내기
		}
		System.out.println();   //줄 바꿈
	} 
	
	
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student (String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public String getMajor() {
		return major;
	}
	

	
}



