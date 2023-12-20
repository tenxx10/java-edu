package chapter09;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		  
		eagle.sleep();
		//eagle.eat 에러남 
		
		Eagle eagleObj = (Eagle)eagle; //강제 형변환
		eagleObj.eat() ;
		
	}

}














