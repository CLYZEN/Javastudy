package ch06.sec10.exam01;

public class Calculator {
	// 정적(static) 필드 : 전역
	static double pi = 3.14;
	
	// 정적(static) 메소드 : 전역
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
	
	void printPi() {
		System.out.println(pi);
	}
}
