package chapter12;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();// 캘린더 today 객체 생성
		
		System.out.println("올해년도: "+today.get(Calendar.YEAR));
		// 올해년도 YEAR
		System.out.println("이번달 : "+(today.get(Calendar.MONTH)+1));
		// 이번달 .MONTH)+1
		System.out.println("년도기준 몇째주 : "+today.get(Calendar.WEEK_OF_YEAR));
		// 년도 기준 몇째주 : WEEK_OF_YEAR
		System.out.println("월기준 몇째주 : "+today.get(Calendar.WEEK_OF_MONTH));
		// 월 기준 몇째주 WEEK_OF_MONTH
		System.out.println("일자 : "+today.get(Calendar.DATE)+"일");
		// 일자 date
		System.out.println("일자 : "+ today.get(Calendar.DAY_OF_MONTH)+"일");
		// 일자 DAY_OF_MONTH 똑같음
		System.out.println("년도기준날짜 : "+today.get(Calendar.DAY_OF_YEAR));
		// 년도 기준 날짜 DAY_OF_YEAR
		System.out.println("요일 (일:1) ~ (토:7) : "+today.get(Calendar.DAY_OF_WEEK));
		// 요일 번호 DAY_OF_WEEK
		System.out.println("월 기준 몇째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		// 월기준 몇째주 요일 DAY_OF_WEEK_IN_MONTH
		
	
	
	
	
	
	}

}
