package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
		// infinity
		int x = 5;
		double y = 0.0;
		double z = x / y ;
		
		System.out.println(z);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("산출불가");
		} else {
			System.out.println("값 : " + z);
		}
		
		// NaN (Not a Number)
//		String a = "abc";
//		if(Double.isNaN(Double.parseDouble(a))) {			
//			System.out.println("숫자가 아닙니다.");
//		} else {
//			System.out.println("숫자입니다.");			
//		}
		
		
	}
}
