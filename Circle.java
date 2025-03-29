package kr.ac.kopo.day0319.home;

public class Circle extends Shape {

	final double pi = 3.141592;
	
	public void area() {
		super.length();
		System.out.printf("반지름이 %d 인 원의 넓이는 %.3f 입니다.", x, x*x*pi);
	}
}
