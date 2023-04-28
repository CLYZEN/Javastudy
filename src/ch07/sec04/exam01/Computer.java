package ch07.sec04.exam01;

public class Computer extends Calculator {

	// override(메소드재정의) : 리턴타입, 메소드이름, 매개변수 같아야 함
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
