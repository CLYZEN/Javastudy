package ch03.sec06;

public class CompareOperationExample {
	public static void main(String[] args) {
		
		// char 끼리 비교
		char char1 = 'A';
		char char2 = 'B';
		
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		
		// 타입이 다른 경우 비교 (int와 float, double)
		int num3 = 1;
		float num4 = 1.0f;
		
		boolean result5 = (num3 == num4);
		System.out.println(result5);
		
		// Exception 타입이 다른 경우 ( float와 double )
		float num5 = 0.1f;
		double num6 = 0.1;
		
//		boolean result6 = (num5 == num6);
		boolean result6 = (num5 == (float) num6);
		System.out.println(result6);
		
		// 문자열 비교
		String str1 = "자바";
		String str2 = "Java";
		
		boolean result7 = (str1.equals(str2));
		boolean result8 = (!str1.equals(str2));
		System.out.println(result7);
		System.out.println(result8);
		
	}
}
