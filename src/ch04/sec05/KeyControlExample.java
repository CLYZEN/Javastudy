package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1. 증속 2. 감속 3. 중지");
			System.out.println("-------------------------------");
			
			// 입력 받기
			System.out.println("선택 : ");
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 :" + speed);
			} else if (strNum.equals("2")) {
				if (speed <= 0) {
					System.out.println("이미 최저속도입니다.");
				} else {					
					speed--;
					System.out.println("현재속도 :" + speed);
				}
			} else if (strNum.equals("3")) {
				speed = 0;
				run = false;
				System.out.println("중지되었습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
