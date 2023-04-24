package ch03.test;

public class Test11 {
	public static void main(String[] args) {
		int fahrenheit = 100;
	    float celcius = ((int) ((5/9F * (fahrenheit-32)) * 100 + 0.5)) / 100F;
	    System.out.println("Fahrenheit:"+fahrenheit);
	    System.out.println("Celcius:"+celcius);

	}
}

