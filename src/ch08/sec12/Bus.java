package ch08.sec12;

public class Bus implements Vechicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}

	public void checkFair() {
		System.out.println("승차 요금을 체크합니다.");
	}
}
