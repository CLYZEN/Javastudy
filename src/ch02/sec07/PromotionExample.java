package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10; // 00001010
		int intValue = byteValue; // 00000000 00000000 00000000 00001010
		System.out.println(intValue);

		char charValue = 'A'; // 65
		intValue = charValue;
		System.out.println(intValue);

		byteValue = 65;
		charValue = (char) byteValue;
		System.out.println(charValue);

		int intValue2 = 50;
		long longValue = intValue2;
		System.out.println(longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
	}

}
