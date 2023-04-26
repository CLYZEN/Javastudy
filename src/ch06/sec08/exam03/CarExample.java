package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		// 인스턴스 생성
		Car myCar01 = new Car(/*5*/);
		
		// 연료 넣어줌.
		myCar01.setGas(5);

		if(myCar01.isLeftGas()) {
			// 가스가 있는 경우 (myCar01.isLeftGas() == true)
			System.out.println("출발");
			myCar01.run();
		}
		System.out.println("연료를 주입하세요.");
	}
}
