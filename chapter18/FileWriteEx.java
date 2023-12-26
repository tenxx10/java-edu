package chapter18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("test3.txt");
			// 문자 하나 출력
			fw.write('A');
			char [] buf = { 'B','C','D' };
			fw.write(buf);
			fw.write(buf, 0, buf.length);
			fw.write("저는 홍길동입니다");
			
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}

}
