package chapter14;

public class GenericEx5 {
	public static void main(String[] args) {
		
		Gen3 g3 = new Gen3();
		
		Generic5<? super Gen2> g2 = new Generic5 <Gen1>(g3);
		
		Gen1 t2 = (Gen3)g2.get();   // Gen1은 부모클래스라서 가능
		Object t1 = g2.get();   // 최상위클래스라서 가능
		
		System.out.println(t2.name);    //Gen1
		System.out.println(t2.getName());   // Gen3 
		
		//Gen2의 하위클래스 제네릭 선언 가능
		Generic5<? extends Gen2> g4 = new Generic5<Gen3>(g3);
		Gen2 t3 = g4.get();
		Gen3 t4 = (Gen3)g4.get();
		
		Generic5<?> g6 = new Generic5<Gen3>(g3);
		Object t5 = g6.get();
		Gen3 t6 = (Gen3)g6.get();
		
		//정수도 가능
		Generic5<?> g7 = new Generic5<Integer>(1);
		System.out.println(g7.get());
		
		
		
	}

}


class Gen1 {
	String name = "Gen1";
	
	String getName() {
		return name;
	}
}

class Gen2 extends Gen1{
	String name = "Gen2";
	
	String getName() {
		return name;
	}
}

class Gen3 extends Gen2{
	String name = "Gen3";
	
	String getName() {
		return name;
	}
}


class Generic5 <T> {
	T obj;
	
	Generic5(T obj){
		this.obj = obj;
	}
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
