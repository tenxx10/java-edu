package chapter15;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.function.IntSupplier;

public class LambdaEx7 {

	public static void main(String[] args) {
		
		//Supplier 매개변수 없고, 리턴값 있는 경우
		
		Supplier<String> s1 = () -> {
			return "홍길동";
		};        
		System.out.println(s1.get());
		
		s1 = () -> "이순신";        // 객체 재정의
		System.out.println(s1.get());   
		
		
		IntSupplier s2 = () ->{
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		System.out.println("주사위 랜덤값 :"+s2.getAsInt());
		
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("파이값 : "+s3.getAsDouble());
		
	}
}
