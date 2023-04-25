package ch05.test;

public class Test09 {
	public static void main(String[] args) {
		int array[][] = { { 95, 86 }, { 85, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int array1 : array[i]) {
				sum += array1;
				count++;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / count);
	}
}
