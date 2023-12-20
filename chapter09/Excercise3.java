package chapter09;

public class Excercise3 {
	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}

	public static void playGame(Player p) {
		p.play();
	}
	
}
