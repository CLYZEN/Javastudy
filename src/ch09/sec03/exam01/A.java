package ch09.sec03.exam01;

public class A {
	static class B {} // 정적 멤버 크래스
	
	B field = new B(); // A 클래스 내부에서 필드로 객체 생성 가능
	static B field2 = new B(); // A클래스 내부에서 정적필드로 객체 생성 가능
	
	A() {
		B b = new B(); // 생성자 내부
	}
	
	void method() {
		B b = new B(); // 메소드 내부
		
	}
	
	static void method2() {
		B b = new B(); // 메소드 내부
		
	}
}
