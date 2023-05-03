package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();

		rc.turnOn();
		rc.setVolume(5);
		
		// default method call
		rc.setMute(true);
		rc.setMute(false);
		
		rc.turnOff();
		
		
		System.out.println("===========================");
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(5);
		
		rc2.setMute(true);
		rc2.setMute(false);
		
		rc2.turnOff();
		
		/*
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
	}
}
