package chapter16;

public class Circle extends Shape{
	
	//필드
	double r;
	
	//생성자
	Circle () {
		this(1);
	}
	
	Circle(double r ){
		this.r = r;
	}

	
	//메소드 오버라이딩
	@Override
	double area() {
		return (r*r)*Math.PI;
	}
	
	@Override
	double length() {
		return (r*2)*Math.PI;
	}
	
	// 일반 메소드 오버라이딩
	@Override
	public String toString() {
		return "넓이:" + this.area();
	}
	

}
