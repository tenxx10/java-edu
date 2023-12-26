package chapter14;


import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		
		MemberEx me1 = new MemberEx("hong", "홍길동", 30);
		MemberEx me2 = new MemberEx("lee", "이순신", 40);
		MemberEx me3 = new MemberEx("kim", "김유신", 50);
		
		List<MemberEx>memberList = new ArrayList<MemberEx>();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
//		for(int i=0; i<memberList.size(); i++) {
//			System.out.println(memberList.get(i).getId()
//					+", "+memberList.get(i).getName()
//					+", "+memberList.get(i).getAge());
//		}
		
		for(int i=0; i <memberList.size(); i++) {
			MemberEx me = memberList.get(i);
			System.out.println(me.getName()+me.getId()+me.getAge());
			
		}
		
		
		
		
	}

}

class MemberEx {
	private String name;
	private String id;
	private int age;
	
	MemberEx(String id, String name, int age){
		this. id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

	
	

