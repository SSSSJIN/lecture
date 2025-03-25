package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("짝수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		try {
			if (num % 2 != 0) {
				throw new NotEvenNumberException("입력하신 정수 [" + num + "]는 짝수가 아닙니다");
//				throw new Exception("입력하신 정수 [" + num + "]는 짝수가 아닙니다");
			}

			System.out.println("입력하신 짝수는 " + num + "입니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}








