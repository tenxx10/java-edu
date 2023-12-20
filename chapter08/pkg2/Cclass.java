package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class Cclass extends Aclass {
	
	Cclass() {


		Aclass ac = new Aclass();
		this.varA = "varA";  //사용가능
//		this.varA2 = "varA2";  //불가
		this.methodA();  //가능
//		this.methodA2();  //불가


		
	}

}
