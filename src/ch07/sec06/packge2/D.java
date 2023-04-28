package ch07.sec06.packge2;

import ch07.sec06.packge1.A;

public class D extends A {
	
	// 생성자
	public D() {
		// 부모의 생성자 호출
		super();
	}
	
	// 메소드
	public void method() {
		// 부모클래스의 field 값 바꿈
		this.field = "value";
		
		// 부모클래스의 메소드 호출
		this.method();
		
		// A의 필드, 생성자, 메소드는 protected
		// protected = 동일 패키지, 상속관계 접근 가능
	}
	
	public void method2() {
		// protected = 서로 다른 패키지에 있기 떄문에 직접 객체 생성 불가
		A a = new A();
		a.field = "value";
		a.method();
	}
}
