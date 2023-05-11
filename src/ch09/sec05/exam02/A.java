package ch09.sec05.exam02;

public class A {
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
	
	
	class B {
		String filed = "B-field";
		
		void method() {
			System.out.println("B-metohd");
		}
		
		void print() {
			System.out.println(this.filed);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
	}
}
