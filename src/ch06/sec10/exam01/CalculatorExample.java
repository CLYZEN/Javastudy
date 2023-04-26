package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator.pi = 4;
		int result1 = Calculator.plus(10,5);
		int result2 = Calculator.minus(10,5);
		System.out.println(result1);
		System.out.println(result2);
		
		// 객체는 각각 다르지만 static이 붙은 필드는 각 객체에서 공유해서 사용한다.
		// 객체는 각각 다르지만 static이 붙은 메소드는 각 객체에서 공유해서 사용한다.
		Calculator myCalc01 = new Calculator();
		System.out.println(" myCalc01.pi : " + myCalc01.pi);
		
		 Calculator myCalc02 = new Calculator();
		System.out.println(" myCalc02.pi : " + myCalc02.pi);
		
		 Calculator myCalc03 = new Calculator();
		System.out.println(" myCalc03.pi : " + myCalc03.pi);
		
		
		
	}
}
