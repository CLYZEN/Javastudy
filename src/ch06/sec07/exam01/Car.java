package ch06.sec07.exam01;

public class Car {
	// 필드 선언
	String comapny;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 생성자
	Car(String m, String c, int s) {
		// 필드 초기화
		this.model = m;
		this.color = c;
		this.maxSpeed = s;
	}
}
