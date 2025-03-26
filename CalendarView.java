package kr.ac.kopo.day16.calendar;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc;
	
	public CalendarView() {
		sc = new Scanner(System.in);
	}
	
	private int scanInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	private int choiceMenu() {
		int no = scanInt("항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
		return no;
	}
	
	public void process() {

		CalendarUtil util = new CalendarUtil();
		while (true) {
			int type = choiceMenu();
			switch (type) {
			case 1:
				int year = scanInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도를 입력하세요 : ");
				int month = scanInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("종료 선택");
				System.exit(0);
			}
		}
	}
}







