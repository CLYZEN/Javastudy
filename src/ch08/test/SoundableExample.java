package ch08.test;

public class SoundableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}
