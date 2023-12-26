package chapter16;

//추상클래스
abstract class Shape implements Comparable<Shape>{ 
	
	// 필드
	int x, y ;
	
	//생성자
	
	Shape() {
		this(0,0);
	}
	
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 추상 메서드
	abstract double area();
	abstract double length();
	
	//일반 메서드
	public String getLocation() {
		return "x:" + x +"y"+ y;
	}
	
	@Override
	public int compareTo(Shape s) {
		return (int)(this.area()- s.area());
	}
	


}
