package ch06.sec08.exam01;

public class CalculaitorMain {
	// 리턴타입이 없는 메소드
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
		return; // 생략가능
	}

	// 리턴타입이 int 인 메소드
	public static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	public static void main(String[] args) {
		powerOn();
		int result = plus(5, 6);
		System.out.println(result);
	}
}
