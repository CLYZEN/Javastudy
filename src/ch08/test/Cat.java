package ch08.test;

public class Cat implements Soundable {
	String sound;
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		this.sound = "야옹";
		return this.sound;
	}
	


}
