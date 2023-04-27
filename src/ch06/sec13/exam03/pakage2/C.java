package ch06.sec13.exam03.pakage2;

import ch06.sec13.exam03.pakage1.*;

public class C {
	public C() {
			A a = new A();
			
			a.field1 = 1;
			
			// A 객체의 field2는 defualt임으로 같은 패키지 내에서만 사용 가능
			// a.field2 = 1; => 불가능
			
			// A 객체의 field3는 private 임으로 같은 클래스 내에서만 사용 가능 
			// a.field3 = 1; => 불가능
			
			// 위 필드 예와 동일
			a.method1();
			
			// a.method2(); => 불가능
			
			// a.method3(); => 불가능
		}

}
