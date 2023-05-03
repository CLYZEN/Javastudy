package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		// RemoteControl 에 선언된 메소드만 사용가능
		rc.turnOn();
		rc.turnOff();
		
		Searchable sc = new SmartTelevision();
		// Searchable 에 선언된 메소드만 사용가능
		sc.search("https://www.naver.com");
	}
}
