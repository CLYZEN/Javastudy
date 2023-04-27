package ch06.sec10.exam03;

public class Car {
	// 인스턴스 필드
	int speed;
	// 정적 필드
	static int gas;
	
	// 인스턴스 메소드
	// 인스턴스 메소드에서는 인스턴스, 정적 필드,메소드 전부 사용 가능.
	void run1 () {
		System.out.println(speed + "속도로 달린다.");
		// System.out.println(gas + "만큼 연료 남았다..");
	}
	
	void run2 () {
		System.out.println(speed + "속도로 달린다.");
		// System.out.println(gas + "만큼 연료 남았다..");
		run1(); // 인스턴스 메소드
		// simulate1(); // 정적 메소드
	}
	
	// 정적(static) 메소드
	static void simulate1() {
		// 정적 메소드에서는 인스턴스 필드, 메소드 사용 불가
		// System.out.println(speed + "속도로 달린다.");
		// run(;)
		
		// gas = static
		// System.out.println(gas + "만큼 연료 남았다..");
		
		//simulate2() = static
		// simulate2();
		
		// 정적 멤버에서 인스턴스 멤버를 사용하기 위해서 객체를 생성해서 사용.
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run1();
	}
	static void simulate2() {
		// 정적 메소드에서는 인스턴스 필드, 메소드 사용 불가
		// System.out.println(speed + "속도로 달린다.");
		
		// gas = static
		 System.out.println(gas + "만큼 연료 남았다..");
		
		// run();
		
	}
	
	// 리턴 타입이 없는 정적 메소드
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.speed = 2000;
		myCar.run1();
		
		System.out.println(Car.gas);
		Car.simulate1();
	}
}
