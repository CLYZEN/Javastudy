package ch13.sec04;

public class GenericExample {
	public static void main(String[] args) {
		boolean result1 = compare(10,20);
		System.out.println(result1);
		System.out.println();
	}

	// T는 Number를 상속받음으로 Number의 하위 클래스만 사용 가능
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		// 타입 파라미터의 타입 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName() + ")");
		
		// primitive 의 double 타입으로 리턴
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
}
