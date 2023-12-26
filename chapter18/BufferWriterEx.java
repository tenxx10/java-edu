package chapter18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
	public static void main(String[] args) {
		
		
		try {
			FileWriter fw = new FileWriter("test4.txt") ;
			BufferedWriter br = new BufferedWriter(fw);
			
			//문자 하나 출력
			br.write('A');
			char [] buf = {'B','C','D'};
			br.write(buf);
			br.write(buf, 0, buf.length);
			br.write(buf, 1, 2);
			br.write("저는 홍길동입니다");
			
			br.flush();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
