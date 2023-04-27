package ch06.sec08.exam04;

public class CarculatorExample {
	public static void main(String[] args) {
		Carculator Calc01 = new Carculator();
		
		double result1 = Calc01.areaRectangle(10);
		System.out.println(result1);
		
		double result2 = Calc01.areaRectangle(10, 50);
		System.out.println(result2);
	
	}
}
