package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain05 {

	static void callFunc() {
		System.out.println("*** callFunc start ***");
		
		try {
			Random r = new Random();
			int random = r.nextInt(5);
			System.out.println("random : " + random);
			System.out.println(10 / random);				
		} catch(Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("*** callFunc end ***");				
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println("------------start-----------");
		callFunc();
		System.out.println("------------end-------------");
		
	}
}
