package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		String strX = scanner.nextLine(); // nextLine = 문자열 입력받음
		int x = Integer.parseInt(strX); // String -> int Parse
//		System.out.println("x : " + x);
		
		System.out.print("y값 입력 : ");
		String strY = scanner.nextLine(); // nextLine = 문자열 입력받음
		int y = Integer.parseInt(strY); // String -> int Parse
		
		int sum = x + y;
		System.out.println("x : "+ x +" y : " + y);
		System.out.println("합 : " + sum);
		
		// 무한 루프
		while(true) {
			System.out.print("입력 문자열 : ");
			String data = scanner.nextLine();
			
			// Java 에서 문자열 비교 시 equals() 사용
			if (data.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			} else {				
				System.out.println("입력 문자열 : " + data);
			}
		}
	}
}
