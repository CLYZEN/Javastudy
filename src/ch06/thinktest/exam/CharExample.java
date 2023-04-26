package ch06.thinktest.exam;

import java.util.Scanner;

public class CharExample {

	public static void main(String[] args) {
		int input = 1;
		int fightinput = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
		System.out.println("--------------------------------------");

		Char character = new Char();

		boolean run = true;
		while (run) {
			// 캐릭터의 상태
			// 1 : 평시 | 2 : 전투 default = 1
			switch (character.status) {
			case 1:
				
				input = scanner.nextInt();
				System.out.println("--------------------------------------");
				System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
				System.out.println("--------------------------------------");

				// status = 1 (평시) || input값 입력
				// 1 : 이동 | 2 : 쉬기 | 3 : 내HP보기 | 4 : 종료
				switch (input) {
				case 1:
					if (character.move()) {
						character.enemy();

						System.out.println("--------------------------------------");
						System.out.println("1.공격 | 2.방어 | 3.도망");
						System.out.println("--------------------------------------");
					} else {
						character.move();
					}
					break;
				case 2:
					character.rest();
					break;
				case 3:
					System.out.println("--------------------------------------");
					System.out.println("현재 HP : " + character.charNowHp);
					System.out.println("--------------------------------------");
					break;
				case 4:
					System.out.println("종료합니다.");
					run = false;

					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;
			// 전투 상태일 때
			case 2:
				System.out.println("--------------------------------------");
				System.out.println("1.공격 | 2.방어 | 3.도망");
				System.out.println("--------------------------------------");

				character.fight();
					fightinput = scanner.nextInt();
					if (fightinput == 1) {
						character.fightStatus = 1;
						break;
					} else if (fightinput == 2) {
						character.fightStatus = 2;
						break;
					} else if (fightinput == 3) {
						character.fightStatus = 3;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}

				break;

			}

		}
	}

}
