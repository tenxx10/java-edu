package chapter12;

class Car {
	
	String name;
	String company;
	
//	public Car (String name, String company) {
//		this.name = name;
//		this.company = company;
//	}
//	
//	@Override
//	public String toString () {
//		return this.company+":"+this.name;
//	}
	
	public String toStirng() { // 투스트링 메서드 재정의
		return company+":"+name;  // 값을 문자열로 리턴
	}
}



public class Exercise2 {
	public static void main(String[] args) {
		
//		Car car = new Car("그렌져","현대자동차");
		Car car = new Car();

		car.name = "그렌져";
		car.company = "현대자동차";
		
		System.out.println(car); //toString 메서드 생략됨
	}

}
