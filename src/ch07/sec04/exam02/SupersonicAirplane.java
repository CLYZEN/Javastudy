package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplain {
	// 상수 field
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 인스턴스 field
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("빠르게 비행");
		} else {
			super.fly();
		}
	}

}
