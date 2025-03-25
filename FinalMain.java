package kr.ac.kopo.day15;

import java.util.Random;

class MyRandom extends Random {

	@Override
	public int nextInt(int bound) {
		
		return super.nextInt(bound) + 1;
	}
	
}

/* final */ class Super {
	
	protected /* final */ double pi = 3.14;
	
	/* final */ void info() {
		System.out.println("Super::info()...");
	}
}

class Sub extends Super {
	
	Sub() {
		this.pi = 3.141592;
	}
	
	@Override
	void info() {
		System.out.println("Sub::info()...");
	}
	
}

public class FinalMain {

	public static void main(String[] args) {
		
		Random r = new MyRandom();
		
		// 1 ~ 10사이의 난수 추출
		int random = r.nextInt(10);
		System.out.println(random);
		
	}
}
