package ch07.sec08.exam01;

public class Car {
	// 필드(객체의 속성)
	public Tire tire;
	
	// 메소드(객체의 기능)
	public void run() {
		// tire 필드에 어떤 타이어가 올지 모르기 때문
		// 대입된 객체의 roll을 호출한다.
		tire.roll();
	}
	
}
