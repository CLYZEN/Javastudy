package ch04.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		boolean run = true;
		int money = 0;
		int moneyin = 0;
		int moneyout = 0;
		String input;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			input = scanner.nextLine();

			switch (input) {
			case "1":
				System.out.println("선택 > " + input);
				System.out.print("예금액 > ");
				moneyin = scanner.nextInt();
				System.out.println(moneyin);
				money = money + moneyin;
				break;
			case "2":
				System.out.println("선택 > " + input);
				System.out.print("출금액 > ");
				moneyout = scanner.nextInt();
				System.out.println(moneyout);
				money = money - moneyout;
				break;
			case "3":
				System.out.println("선택 > " + input);
				System.out.println("잔고 > " + money);
				break;
			case "4":
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}

		;
	}
}
