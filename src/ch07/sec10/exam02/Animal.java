package ch07.sec10.exam02;

public abstract class Animal {
	/*
	String owner;
	
	// 생성자
	Animal(String owner) {
		this.owner = owner;
	}
	*/
	// 일반 메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드(선언만) => 구현은 Override 해서 사용 (자식클래스에서)
	public abstract void sound();
}
