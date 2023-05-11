package ch09.sec05.exam01;

public class A {
	// 인스턴스 필드, 메소드
	int field1;
	void method1() {
		
	}
	// 정적 필드, 메소드
	static int field2;
	static void method2() {
		
	}
	
	class B {
		void method() {
			field1 = 10;
			method1();
		}
	}
	
	static class C {
		void method() {
			
		}
	}
}
