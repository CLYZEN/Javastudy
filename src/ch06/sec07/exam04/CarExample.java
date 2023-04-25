package ch06.sec07.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar01 = new Car();
		System.out.println("myCar01.company : " + myCar01.company);
		System.out.println("myCar01.model : " + myCar01.model);
		System.out.println("myCar01.color : " + myCar01.color);
		System.out.println("myCar01.maxSpeed : " + myCar01.maxSpeed);
		
		System.out.println("====================");
		
		Car myCar02 = new Car("자가용");
		System.out.println("myCar02.company : " + myCar02.company);
		System.out.println("myCar02.model : " + myCar02.model);
		System.out.println("myCar02.color : " + myCar02.color);
		System.out.println("myCar02.maxSpeed : " + myCar02.maxSpeed);
				
		System.out.println("====================");
		
		Car myCar03 = new Car("자가용", "빨강");
		System.out.println("myCar03.company : " + myCar03.company);
		System.out.println("myCar03.model : " + myCar03.model);
		System.out.println("myCar03.color : " + myCar03.color);
		System.out.println("myCar03.maxSpeed : " + myCar03.maxSpeed);
		
		System.out.println("====================");
		
		Car myCar04 = new Car("자가용", "검정",300);
		System.out.println("myCar04.company : " + myCar04.company);
		System.out.println("myCar04.model : " + myCar04.model);
		System.out.println("myCar04.color : " + myCar04.color);
		System.out.println("myCar04.maxSpeed : " + myCar04.maxSpeed);
		
		
	}
}
