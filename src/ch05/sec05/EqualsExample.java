package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("주소 일치");
		} else {
			System.out.println("주소 불일치");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("값 일치");
		} else {
			System.out.println("값 불일치");
		}
		
		System.out.println("==========================================");
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("주소 일치");
		} else {
			System.out.println("주소 불일치");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("값 일치");
		} else {
			System.out.println("값 불일치");
		}
		
		System.out.println("==========================================");
		String hobby = "";
		
		if (hobby.equals("")) {
			System.out.println("빈문자열");
		}
	}
}
