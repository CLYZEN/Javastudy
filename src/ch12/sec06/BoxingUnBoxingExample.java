package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// 박싱 : primitive type => 포장 타입으로 변경
		Integer obj = 100;
		System.out.println(obj.intValue()); // int type 으로 변경
		
		// 언박싱 : 포장 타입 => primitive type(기본)
		int value = obj;
		System.out.println(value);
		
		// 연산시 자동으로 primitive type 으로 변경
		int result = obj + 100;
		System.out.println(result);
	}
}
