package chapter6;

//public class Lotto {
//	public static void main(String[] args) {
//		
//		int[] lotto = new int[6];
//		
//		int idx = 0; 
//		while (true)   {       //무한반복 시작
//			int number = (int)(Math.random()*45)+1;     //0부터 
//			
//			boolean insert = true;
//			for (int i =0; i <idx; i++) {
//				if (lotto[i] == number) {
//					insert = false;
//					break;
//				}
//			}
//			if (insert == true) {
//				lotto[idx] = number;
//				idx++;
//			}
//			if (idx==6) break;
//		}
//		for (int i=0; i<lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
//	}
//
//}

public class Lotto {
    public static void main(String[] args) {
        
        int[] lotto = new int[6]; // 로또 번호를 저장할 배열을 생성합니다.

        int idx = 0; // 현재까지 저장된 로또 번호의 개수를 나타내는 변수입니다.

        while (true) { // 무한 루프를 시작합니다.
            int number = (int)(Math.random() * 45) + 1; // 1부터 45까지의 난수를 생성합니다.

            boolean insert = true; // 현재 생성된 번호를 배열에 추가할 수 있는지 여부를 나타내는 변수입니다.

            // 이미 저장된 번호와 중복되지 않는지 검사합니다.
            for (int i = 0; i <= idx; i++) {
                if (lotto[i] == number) {
                    insert = false; // 중복된 번호가 있으면 insert를 false로 설정합니다.
                    break; // 중복된 번호가 발견되면 더 이상 검사하지 않고 반복문을 종료합니다.
                }
            }

            if (insert == true) {
                lotto[idx] = number; // 중복되지 않는 경우 해당 번호를 배열에 추가합니다.
                idx++; // 배열에 번호를 추가했으므로 idx를 1 증가시킵니다.
            }

            if (idx == 6) break; // 6개의 로또 번호를 모두 저장했으면 무한 루프를 종료합니다.
        }

        // 배열에 저장된 로또 번호를 출력합니다.
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }
    }
}

