package chapter12;

public class StringEx7 {
	public static void main(String[] args) {
		
		String str = "Hello My Name is Hong Gil Dong(Name)";
		
		System.out.println(str.charAt(6));
		//M
		System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
		//false
		System.out.println(str.indexOf("Hong"));
		//17
		System.out.println(str.indexOf("H"));
		//0
		System.out.println(str.substring(17));
		//Hong Gil Dong(Name)
		System.out.println(str.substring(6, 13));
		//My Name
		System.out.println(str.toLowerCase());
		//hello my name is hong gil dong(name)
		System.out.println(str.toUpperCase());
		//HELLO MY NAME IS HONG GIL DONG(NAME)
		System.out.println(str.length());
		//36
		System.out.println(str.startsWith("Hello"));
		//true
		System.out.println(str.endsWith("Dong"));
		//false
		System.out.println(str.replace("Hong", "kim"));
		//Hello My Name is kim Gil Dong(Name)
		System.out.println(str.replaceAll("Name", "Nickname"));
		//Hello My Nickname is Hong Gil Dong(Nickname)
		System.out.println(str.toString());
		//Hello My Name is Hong Gil Dong(Name)
		
		str = "    언뇽허삽니까,    오래망갑습니다.      ";
		System.out.println(str.trim());     //앞뒤 공백제거
		//언뇽허삽니까,    오래망갑습니다.
		System.out.println(str.replace(" ", ""));
		//언뇽허삽니까,오래망갑습니다.
		
		str = String.valueOf(10);   //기본자료형 int 10 을 문자열로 변경
		System.out.println(str);
		str = String.valueOf(10.5);    // 기본자료형 double 10.5 을 문자열로 변경
		System.out.println(str);
		
		str = "홍길동,이순신,유관순,안중근";
		String [] arr = str.split(",");   // ,구분자로 나눠서 배열로 리턴
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"번 인덱스 값 = "+arr[i]);
		}
		/*0번 인덱스 값= 홍길동
		1번 인덱스 값= 이순신
		2번 인덱스 값= 유관순
		3번 인덱스 값= 안중근
		*/
		
		
		
		
	}

}
