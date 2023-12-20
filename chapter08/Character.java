package chapter08;

class Worrior extends Character{
	int hp;
	int power;
	int weapon;
	
	void attack (Object targer) {
		System.out.println("공격");
	}
	void defence(Object target) {
		System.out.println("방어");
	}
	
}

class Gladiator extends Character{
	int hp;
	int power;
	int shield;
	
	void attack (Object targer) {
		System.out.println("공격");
	}
	void Powerattack(Object target) {
		System.out.println("파워공격");
	}
	
}

class Wizard extends Character{
	int hp;
	int power;
	int heal;
	
	void attack (Object targer) {
		System.out.println("공격");
	}
	void healing(Object target) {
		System.out.println("치료마법");
	}
	
}



public class Character {
	public static void main(String[] args) {
		
		Character[] cha = new Character[3];
		
		Character worrior = new Worrior ();
		Character gladiator = new Gladiator();
		Character wizard= new Wizard();
		
		cha [0] = worrior;
		cha [1] = gladiator;;
		cha [2] = wizard;
		
		for (int i=0; i<cha.length; i++) {
			cha[i].attack();
		}
	}

	
	
	
	
	
	
	
	
}











