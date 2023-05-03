package ch08.sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		ride(taxi);
		System.out.println("==================");
		ride(bus);
	}
	
	public static void ride(Vechicle vechicle) {
		
		// vechicle 이 Bus를 참조하고 있나.
		// 자동타입변환을 실시했나?
		if(vechicle instanceof Bus) {
			// 강제타입변환
			// 자식이 부모를 참조할 때
			Bus bus = (Bus)vechicle;
			
			bus.checkFair();
		} 
		vechicle.run();
	}
}
