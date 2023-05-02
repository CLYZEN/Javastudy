package ch07.sec10.exam02;

public class Dog extends Animal {
	/*
	Dog(String owner) {
		super(owner);
	}
	*/
	// 추상클래스가 부모 클래스일때 추상 메소드가 있으면 반드시 Override 해야함.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
