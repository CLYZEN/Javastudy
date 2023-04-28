package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator myCalc = new Calculator();
		System.out.println(" 원 면적 : " + myCalc.areaCircle(r));
		
		// 메소드 오버라이딩 되었다면 자식클래스 우선 사용.
		Computer myCom= new Computer();
		System.out.println(" 원 면적 : " + myCom.areaCircle(r));
		
	}
}
