package chapter12;

import java.util.Date;




public class CalendarEx3 {
	public static void main(String[] args) {
		
		// 현재일
		int sYear = 2020;
		int sMonth = 6;
		int sDay = 12;
		
		// 이전일
		int eYear = 2020;
		int eMonth = 6;
		int eDay = 1; 
		
		Date sd = new Date();
		Date ed = new Date(); 
		
		sd.setYear(sYear);
		sd.setMonth(sMonth);
		sd.setDate(sDay);
		
		ed.setYear(eYear);
		ed.setMonth(eMonth);
		ed.setDate(eDay);
		
		//date 메소드들은 calendar 가 추가된 이후 deprecated 되어서 잘 안씀
		
		long temp = (sd.getTime() - ed.getTime()) / (1000L *60L * 60L *24L);
		int diff = (int) temp;
		
		System.out.println(sd.getTime());
		System.out.println(ed.getTime());
		System.out.println( (sd.getTime() - ed.getTime()));
		System.out.println(diff+"일 경과");
		
		
		// 사실상 이거 너무 옛날 방식이라 다른 거 쓰라고함
		// calendar 버전

//		        Calendar startDate = Calendar.getInstance();
//		        startDate.set(2020, Calendar.JUNE, 12);
//		        
//		        Calendar endDate = Calendar.getInstance();
//		        endDate.set(2020, Calendar.JUNE, 1);
//		        
//		        long timeInMillisDifference = startDate.getTimeInMillis() - endDate.getTimeInMillis();
//		        long daysDifference = timeInMillisDifference / (1000L * 60L * 60L * 24L);
//		        
//		        System.out.println(daysDifference + "일 경과");
		
		// LocalDate 패키지 이용한 버전
		
//		import java.time.LocalDate;
//		import java.time.temporal.ChronoUnit;

//		        LocalDate startDate = LocalDate.of(2020, 6, 12);
//		        LocalDate endDate = LocalDate.of(2020, 6, 1);
//		        
//		        long daysDifference = ChronoUnit.DAYS.between(endDate, startDate);
//		        
//		        System.out.println(daysDifference + "일 경과");


		
	}

}




