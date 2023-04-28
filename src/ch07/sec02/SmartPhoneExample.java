package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "분홍색");

		myPhone.setWifi(true);
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("안녕하세요.");
		myPhone.receiveVoice("안녕.");
		myPhone.hangUp();
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
	}
}
