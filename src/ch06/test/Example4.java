package ch06.test;

public class Example4 {
	static int result = 0;

	// max 메소드 작성
	static int max(int arr[]) {
		if (arr == null || arr.length == 0) {
			result = -999999;
		} else {
			for (int ar : arr) {
				if(result < ar) {
					result = ar;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };

		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}

}
