package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {

		System.out.println("------------start-----------");
		
		Random r = new Random();
		
		try {
			int random = r.nextInt(5);
			System.out.println("random : " + random);
			
			System.out.println(10/random);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행...");
		}		
		System.out.println("------------end-------------");		
	}
}