package chapter13;

//import java.util.Comparator;

public class Member2 implements Comparable{ 
	
	//필드
	String name;
	int age;
	
	//생성자
	Member2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//toString() 메서드 재정의
	@Override
	public String toString() {
		return "("+name+", "+age+")";
	}
	
	@Override
	public int compareTo(Object o) {
		Member2 m = (Member2) o;
		return this.name.compareTo(m.name);
	}

}
