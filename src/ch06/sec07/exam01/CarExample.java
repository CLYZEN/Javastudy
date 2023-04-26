package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 인스턴스 생성 시 생성자 호출
		Car myCar = new Car("제네시스","검정",2000);
		
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
	}
}