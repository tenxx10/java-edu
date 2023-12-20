package chapter13;

public class Rectangle extends Shape {
	
	int w,h;
	
	Rectangle() {
		this(1,1);
	}
	
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	//메서드 오버라이딩
	@Override
	double area() {
		return (w*h);
	}
	
	double length() {
		return (w+h) *2;
	}

}
