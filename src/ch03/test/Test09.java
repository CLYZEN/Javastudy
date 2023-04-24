package ch03.test;

public class Test09 {
	public static void main(String[] args) {
		int num = 0;
		String result = (num > 0) ? "양수" : ((num == 0) ? "0" : "음수");

		System.out.println(result);
	}
}
