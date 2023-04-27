package ch06.sec10.exam02;

public class Television {
	// 정적필드는 필드 선언과 동시에 초기값 주는게 일반적
	static String company = "myCompany";
	static String model = "LCD";
	static String info;
	
	// 정적 블록 : 복잡한 연산 등 초기화 작업이 필요할 때 사용
	static {
		info = company + "-" + model;
	}
}
