package kr.ac.kopo.day0319.home;

import java.util.Random;

public class Rectangle extends Shape {

	Random ran = new Random();
	int y = ran.nextInt();
	
	public void length() {
		super.length();
		y = ran.nextInt(9) + 2;
	}
	
	public void area() {
		this.length();
		System.out.printf("가로 %d 높이 %d 인 직사각형의 넓이는 %d 입니다.", x, y, x*y);
	}
}
