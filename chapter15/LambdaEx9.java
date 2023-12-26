package chapter15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;


public class LambdaEx9 {
	
	static Student [] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신",95,70,"통계"),
			new Student("김유신", 100, 60, "빅데이터")
	}; 
	
	public static void main(String[] args) {
		
		System.out.print("최대 수학 점수 : " );
		int max = maxOrMinMath( (a,b) -> {
			if (a>=b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("최소 수학 점수 :");
		System.out.println(maxOrMinMath((a,b) -> (a<=b ? a:b)));
		
		System.out.print("최대 평균 점수 :");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b ? a:b)));
		
		System.out.print("최소 평균 점수 :");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b ? a:b)));
		
	
	}
	
	
	// 두 개의 int 값을 연산하여 int 값을 리턴 
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();    //여기 왜 list 0번 인덱스를 가져오는지 ?
		for (Student s : list) {
			result : op.applyAsInt(result, s.getMath());  
		}
		return result;
	}
	
	// 두 개의 double 값을 연산하여 int 값을 리턴  (평균 구할 예정이라 double)
		private static Double maxOrMinAvg(DoubleBinaryOperator op) {
			double result = (list[0].getMath() + list[0].getEng() ) / 2.0 ;
			for (Student s : list) {
				result : op.applyAsDouble(result, (s.getMath()+s.getEng())/ 2.0);    //약간 복잡하게 느껴지는 .. 
			}
			return result;
		}
		
	
	

}
