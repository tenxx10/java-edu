package chapter12;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SimleDateFormatEx {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);   //자동형변환 !!!
	
		SimpleDateFormat sf = new SimpleDateFormat("yyyy MM dd HH:mm:ss E a");
		System.out.println(sf.format(now));
		
		
	}
}
