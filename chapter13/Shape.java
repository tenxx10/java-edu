package chapter13;

abstract class Shape {
	
	//필드
	int x,y;   // 인스턴스 변수
	
	//생성자
	Shape(){
		this(0,0);
	}
	
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//추상메서드
	abstract double area();
	abstract double length();

	//기본 메서드
	public String getLocation() {
		return "x : "+x+", y : "+y;    //String 리턴으로 기본구현겂
	}
}
