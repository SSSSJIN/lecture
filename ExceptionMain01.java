package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("--------------start-----------------");
		
		Random r = new Random();
		
		int random = r.nextInt(5); // 0 ~ 4
			System.out.println("random : " + random);
		
		if(random != 0)
			System.out.println(10/random);		
/*			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
*/		
		System.out.println("--------------end-----------------");
	}
}