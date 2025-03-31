package kr.ac.kopo.day17;

import java.util.ArrayList;
import java.util.List;

/*
 	primitive type			Wrapper Class
 		boolean					Boolean
 		char					Character
 		byte					Byte
 		short					Short
 		int						Integer
 		long					Long
 		float					Float
 		double					Double     
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(15);
		//i = 15;	// auto boxing
		
		int num = i;	// auto unboxing
		
		
		// 정수를 저장하는 리스트 생성
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(3);
		
		int value = list.get(0);
	}
}









