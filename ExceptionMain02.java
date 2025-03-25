package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("--------------start-----------------");
	
		Random r = new Random();

		try {
			int random = r.nextInt(5);	// 0 ~ 4
			System.out.println("random : " + random);
		
			System.out.println(10/random);
			
			char[] arr = new char[3];
			System.out.println("3번째 문자 : " + arr[3]);
			
		} catch(ArithmeticException ae) {
			System.out.println("ArithmethicException...");
	//		System.out.println("message : " + ae.getMessage());
			ae.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException aioe) {
			System.out.println("ArrayIndexOutOfBoundsException...");
			aioe.printStackTrace();
		}
		
		System.out.println("--------------end-----------------");

	}

}
