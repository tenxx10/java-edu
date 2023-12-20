package chapter08;

public class Character2 {
	
		
		int hp;
		int power;
		
		public void attack (Object targer) {
			System.out.println("공격");
		}
		

	}



class Worrior extends Character2{
	
	int weapon;
	
	
	void defence(Object target) {
		System.out.println("방어");
	}
	
}

class Gladiator extends Character2{
	
	int shield;
	

	void Powerattack(Object target) {
		System.out.println("파워공격");
	}
	
}

class Wizard extends Character2 {
	
	int heal;
	
	
	void healing(Object target) {
		System.out.println("치료마법");
	}
	
}


