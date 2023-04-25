package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 인스턴스 : new 로 생성한 객체
		Car myCar = new Car();

		// InstancsName.FieldName 으로 접근
		System.out.println("myCar 제조사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		System.out.println("==============================");
		
		// 필드 값 변경 : InstancsName.FieldName = Value
		myCar.speed = 32;
		System.out.println("myCar 제조사 : " + myCar.company);
		System.out.println("수정된 myCar 속도 : " + myCar.speed);
		System.out.println(myCar);
		
		System.out.println("==============================");
		
		Car myCar2 = new Car();
		myCar2.speed = 64;
		myCar2.company = "기아자동차";
		System.out.println("myCar2 제조사 : " + myCar2.company);
		System.out.println("수정된 myCar2 속도 : " + myCar2.speed);
		System.out.println(myCar2);
		
		System.out.println("==============================");
		
		Car myCar3 = new Car();
		myCar3.speed = 128;
		myCar3.company = "르노삼성자동차";
		System.out.println("myCar3 제조사 : " + myCar3.company);
		System.out.println("수정된 myCar3 속도 : " + myCar3.speed);
		System.out.println(myCar3);
	}
}
