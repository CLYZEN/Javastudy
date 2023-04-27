package ch06.sec11.exam01;

public class KoreaExample {
	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567","김자바");
		
		// field 값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// field 값 변경
		
		// final 변경 불가
		// k1.nation = "USA";
		// k1.ssn = "1234";
		System.out.println("========================");
		// 가능
		k1.name = "이자바";
		
		// field 값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		
	}
}
