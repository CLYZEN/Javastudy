package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.run1();
		System.out.println();
		car.run2();
		System.out.println();
		// 매개변수로 익명 자식객체 주기
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("한국 타이어가 회전합니다.");
			}
		});
	}
}
