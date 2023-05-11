package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); // 클래스 찾기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2"); // 클래스 찾기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
