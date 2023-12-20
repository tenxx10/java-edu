package chapter13;

public class Circle extends Shape {
	
	//필드
	double r;
	
	// 생성자
	Circle(){
		this (1) ;
	}
	
	Circle(double r){
		this.r = r ;
	}
	
	//Circle 클래스가 만든 것들
	
	//여기서부터가 재정의 (오버라이딩)
	@Override
	double area() {
		return (r*r) *Math.PI;
	}
	
	@Override
	double length() {
		return (r*2) *Math.PI;
		
	}

}
