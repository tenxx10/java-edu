package chaper5;

public class CCCC {
	public static void main(String[] args) {
		
		

//
//		int tot =0;
//		int i = 1;
//
//
//		while (i <= 6) {
//			if (i==6) {
//				break;
//			} else {
//				System.out.println("("+i+")");
//				tot += i;
//			}
//
//			System.out.println("총 주사위 굴린 횟수는:"+tot);
//			
			
			int tot = 0;
			int i = 1;

			while (i <= 6) {
			    System.out.println("(" + i + ")");
			    tot += i;

			    if (i == 6) {
			        break;
			    }

			    i++;
			}

			System.out.println("총 주사위 굴린 횟수는: " + tot);
		
		
	}

}
