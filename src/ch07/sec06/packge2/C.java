package ch07.sec06.packge2;

import ch07.sec06.packge1.A;

public class C {
	public void method() {
		// 다른 패키지 내 클래스라 접근 문제 O
		// protected = 같은 패지키 or 상속
		A a = new A();
		a.field = "value";
		a.method();
	}
}
