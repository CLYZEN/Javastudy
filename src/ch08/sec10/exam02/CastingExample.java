package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 자동타입변환
		vehicle.run();
		// vehicle.checkFare() // 자식클래스의 고유 메소드/필드 실행 불가
		
		System.out.println("==========");
		
		// 강제타입변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
