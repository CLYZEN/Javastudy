package ch05.test;

public class Test07 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		for(int ar : arr) {
			sum += ar;
		}
		System.out.println("sum : " + sum);
	}
}
