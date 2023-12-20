package chapter13;

public class Member {
	
	String name;
	int age;
	
	public Member(String name, int age) { 
		this.name = name;
		this.age = age;
		
	}

	//toString 메서드 재정의
	@Override
	public String toString() {
		return "("+name+","+age+")";
		
	}

	//equals() 메서드 재정의
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}

	//HashCode() 메소드 재정의
	@Override
	public int hashCode() {
		return this.name.hashCode() +age;
	}



}
