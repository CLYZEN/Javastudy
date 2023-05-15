package ch12.sec06;

public class ValueCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println(obj1 == obj2); // 주소 비교
		System.out.println(obj1.equals(obj2)); // 값 비교
		
		// Byte, Short, Integer는 -128 ~ 127 사이의 값을 비교 시 값을 비교함. 
		Integer obj3 = 10; 
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		
	}
	
}
