package ch08.test;

public class Dog implements Soundable {
	String sound;
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		this.sound = "멍멍";
		return this.sound;
	}

}
