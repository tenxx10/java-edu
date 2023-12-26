package chapter15;

import java.util.function.Predicate;

public class LambdaEx10 {
	
	static Student [] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신",95,70,"통계"),
			new Student("김유신", 100, 60, "빅데이터")
	}; 
	
	
	public static void main(String[] args) {
		
		//과가 컴공인 학생의 영어점수 평균
		double avg = avgEng( t -> t.getMajor().equals("컴공"));   //람다식 실행
		System.out.println("컴공과 영어점수 평균 : "+avg);
		
		
		//과가 컴공인 학생의 수학점수 평균
		double avg2 = avgMath( t -> t.getMajor().equals("컴공"));   //람다식 실행
		System.out.println("컴공과 수학점수 평균 : "+avg);
		
		
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count =0;
		int sum =0 ;
		for (Student student : list) {
			//equals 비교
			if (predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		
		return (double) sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count =0;
		int sum =0 ;
		for (Student student : list) {
			//equals 비교
			if (predicate.test(student)) {
				count++; 
				sum += student.getMath();
			}
		}
		
		return (double) sum/count;
	}
	
	
}
