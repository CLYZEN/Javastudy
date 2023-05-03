package ch08.test;

public class TV  implements Remocon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon r = new TV();
		r.powerOn();
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켰습니다.");
	}
}
