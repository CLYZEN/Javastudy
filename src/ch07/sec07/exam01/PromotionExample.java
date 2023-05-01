package ch07.sec07.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동타입변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		// B b2 = e; // 관계성없음 자동타입변환 에러
		
		// C c1 = d; // 관계성없음 자동타입변환 에러
		C c2 = e;
		
	}
}
