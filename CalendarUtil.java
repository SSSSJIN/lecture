package kr.ac.kopo.day16.calendar;

import java.util.ArrayList;
import java.util.Calendar;

public class CalendarUtil {
	
	private Calendar c;

	public CalendarUtil() {
		c = Calendar.getInstance();
	}

	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
	
	public void showByMonth(int year, int month) {
		System.out.println("<< " + year + "년 " + month + "월 >>");

		// 해당 년, 월, 1일로 날짜정보 변경
		c.set(year, month-1, 1);
		
		// 출력하려는 달의 마지막날이 언제냐???
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 출력하려는 달의 1일이 무슨요일이야???
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		showByDay(week, lastday);
	}
	
	/**
	 * 
	 * @param week  1일의 요일(1(일)-7(토))
	 * @param lastday 해당월의 마지막날
	 */
	private void showByDay(int week, int lastday) {

		System.out.println("----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------------------");
		int cnt = 0;
		for(int i = 1; i < week; i++, cnt++)
			System.out.print("\t");
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0)
				System.out.println();
		}
		if(cnt % 7 != 0)
			System.out.println();
		System.out.println("----------------------------------------------------");
		
	}

}
















