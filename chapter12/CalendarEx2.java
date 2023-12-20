package chapter12;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("오전 (0) 오후 (1) : "+ today.get(Calendar.AM_PM));
		// 오전 0 오후 1 Calendar.AM_PM
		System.out.println("시간 (0~11) : "+ today.get(Calendar.HOUR));
		// 시간 0~11 HOUR
		System.out.println("시간 (0~23) : "+ today.get(Calendar.HOUR_OF_DAY));
		// 시간 0~23 (24시간 기준) HOUR_OF_DAY
		System.out.println("분 (0~59) : "+today.get(Calendar.MINUTE));
		// 분 MINUTE
		System.out.println("초 (0~59) : "+today.get(Calendar.SECOND));
		// 초 SECOND
		System.out.println("밀리초(0~999) : "+today.get(Calendar.MILLISECOND));
		// 밀리초 MILLISECOND
		System.out.println("Timezone(12~12) : " +today.get(Calendar.ZONE_OFFSET) / (60*60*1000));
		// GMT 기준 시차
		System.out.println("이번달의 마지막 일자 : "+today.getActualMaximum(Calendar.DATE));
		// 이번달 마지막 일자 getActualMaximum(Calendar.DATE)
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, (6-1), 12);
		System.out.println("날짜 : "+ cal.get(Calendar.YEAR)+"년 "
				+ (cal.get(Calendar.MONTH)+1) + "월 "
				+ cal.get(Calendar.DATE)+"일");
		
		
		
	}

}
