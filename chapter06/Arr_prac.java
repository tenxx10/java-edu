package chapter6;

public class Arr_prac {
	public static void main(String[] args) {
		
	//로또 프로그램 해보기
		
		int[] lotto = new int[6];   // 몇개 담을 건지 정해놓기
		
		int idx=0;    //일단 빈 변수 만들어놓기 여기에 인덱스 담을 거임
		while (true) {    //몇번 반복할지 모를땐 무한루프 대신 break 잘 걸어줘야함
			int number = (int)(Math.random()*45)+1;    // 넘버에다가 난수 45개 1~45까지 담을거임 +1 필수임
			
			boolean insert = true; // 중복확인 코드 짜줄 예정
			for (int i = 0; i <=idx; i++) {      //이해는 했는데 사실 뭔말인지 모르겠음 ㅁㅊ
				if (lotto[i] == number) {
					insert = false;
					break;      // 브레이크해서 어쩌라는건지... 이걸 중복거르는건가.... 
				}
			}
			if (insert == true) {     //여기까지 왔다는 건 true라서 넘어온 거임
				lotto[idx] = number;     // 드디어 난수를 로또에 난수를 더해줌!
				idx++;              // 그리고 인덱스 값도 1개 쌓음
			}
			if (idx == 6) break;    // 그렇게 돌고 돌아 6개가 쌓이면 끝냄
				
		}
		
			for (int i=0; i<lotto.length; i++) {         // 이제 로또 번호 뱉을 차례임
				System.out.println(lotto[i]);           // i를 인덱스에 넣어주고 for문 안에서 뱉어내기!!!!
			}
			
			
			int[] number1 = new int[100];
			
			for(int i=0; i<number1.length; i++) {
				number1[i] = i;
				System.out.println(number1[i]);// 이게 뭐지!!
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		

		
	}


