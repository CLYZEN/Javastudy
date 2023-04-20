package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		// 정확한 계산 = 정수 연산
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		
		int result = totalPiece - number;
		System.out.println("사과 1개에서 남은 양 : "+ result/10.0);
	}
}
