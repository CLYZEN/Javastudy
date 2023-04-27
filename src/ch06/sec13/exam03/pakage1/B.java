package ch06.sec13.exam03.pakage1;

public class B {
	public void method() { 
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		// A 객체의 field3는 private 임으로 같은 클래스 내에서만 사용 가능 
		// a.field3 = 1; => 불가능
		
		// 위 필드 예와 동일
		a.method1();
		a.method2();
		// a.method3(); => 불가능
	}
	
	
}
