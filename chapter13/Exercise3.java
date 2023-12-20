package chapter13;


import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		
		MemberEx me1 = new MemberEx("hong","홍길동",30);
		MemberEx me2 = new MemberEx("lee","이순신",30);
		MemberEx me3 = new MemberEx("kim","김유신",30);
		
		List memberList = new ArrayList();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
//		System.out.println(memberList);
		// 전체 회원 출력
	
		for (int i =0; i<memberList.size(); i++) {
			MemberEx me = (MemberEx) memberList.get(i);  // 멤버 ex 강제 형변환 
			System.out.println(me.getId()+","+me.getName()+","+me.getAge());
		}
		
		
	}

}

class MemberEx {
	String id;
	String name;
	int age;
	
	MemberEx (String id, String name, int age ){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public String setId(String id) {
		return this.id;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int age) {
		return this.age;
	}
	

	
}