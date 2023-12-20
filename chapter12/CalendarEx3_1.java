package chapter12;

import java.util.Calendar;

public class CalendarEx3_1 {
	    public static void main(String[] args) {
	    	
	    	
	        Calendar startDate = Calendar.getInstance();  // 객체 생성하고
	        startDate.set(2020, Calendar.JUNE, 12);   // 객체.set 이용해서 한줄로 값 입력
	        
	        Calendar endDate = Calendar.getInstance();
	        endDate.set(2020, Calendar.JUNE, 1);    // 마찬가지
	        
	        long timeInMillisDifference = startDate.getTimeInMillis() - endDate.getTimeInMillis();
	        long daysDifference = timeInMillisDifference / (1000L * 60L * 60L * 24L);
	        // calendar 클래스는 1일 정도 오차발생함 
	        
	        
	        System.out.println(daysDifference + "일 경과");
	        
	        
	    }
	}

