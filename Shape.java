package kr.ac.kopo.day0319.home;

import java.util.Random;

public class Shape {

	int x;
	
	Random ran = new Random();	
	
	public void length() {
		x = ran.nextInt(9) + 2;		
	}	
}
