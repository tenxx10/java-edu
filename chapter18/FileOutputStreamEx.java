package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt",true);   //새로 생성해줌
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
