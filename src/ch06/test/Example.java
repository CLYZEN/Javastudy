package ch06.test;

public class Example {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	// 정적 필드에 인스턴스 필드를 대입하기 때문. // 인스턴스 생성 후 인스턴스를 통해 접근 해야 함
	// static int cv2 = iv;
	
	static void staticMethod1() {
		System.out.println(cv);
		// 정적 메소드에 인스턴스 필드를 대입하기 때문. // 인스턴스 생성 후 인스턴스를 통해 접근 해야 함
		//System.out.println(iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		 // 인스턴스를통해 접근해야함
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		// 정적 메소드에 인스턴스 메소드를 실행하기 떄문 // 인스턴스를 통해 접근해야 함.
		// instanceMethod1();
	}
	
	void instanceMethod2() {
		// 인스턴스 메소드에 정적 메소드를 실행하기 때문.
		// ststicMethod1();
		instanceMethod1();
	}
}
