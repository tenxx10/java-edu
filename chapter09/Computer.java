package chapter09;

public class Computer {
	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 :"+gc.MEMORY);
	
		//Amd 로 생성
		gc = new Amd();
		gc.process();
		System.out.println("메모리 :"+gc.MEMORY);
		
		//Nvidia 로 교체
		gc = new Nvidia();
		gc.process();
	}

}
