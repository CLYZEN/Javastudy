package ch12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) {
		// 첫번째 방법
		//Class clazz = Car.class; // Car 클래스의 class 객체를 얻어옴. 

		// 두번째 방법
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		// 세번째 방법
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지 : " + clazz.getPackage().getName() );
		System.out.println("클래스 이름 : " + clazz.getSimpleName() );
		System.out.println("패키지 : " + clazz.getName() );
		
	}

}
