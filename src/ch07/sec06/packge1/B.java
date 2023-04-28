package ch07.sec06.packge1;

public class B {
	public void method() {
		// 같은 패키지 내 클래스라 접근 문제 X
		A a = new A();
		a.field = "value";
		a.method();
	}
}
