package kr.ac.kopo.day0319.home;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 도형을 선택하세요(1.삼각형, 2.직사각형, 3.정사각형, 4. 원) => ");
		int num = sc.nextInt();

		switch(num) {
		case 1 : 
			Triangle tri = new Triangle();
			tri.area();
			break;
		case 2 : 
			Rectangle rec = new Rectangle();
			rec.area();
			break;
		case 3 : 
			Square squ = new Square();
			squ.area();
			break;
		case 4 : 
			Circle cir = new Circle();
			cir.area();
			break;
		}	
	}
}
//abstract 쓰고 인터페이스 써서 재정의하고 묵시적, 명시적 형변환을 통해서 코드 다시 짜기
//아직 안끝났다.
