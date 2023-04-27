package QuestionAccount;

import java.util.Scanner;

public class BankApplication {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String input;
		boolean run = true;

		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			input = scanner.nextLine();
			switch (input) {
			case "1":
				createAccount();
				break;
			case "2":
				accountList();
				break;
			case "3":
				inputMoney();
				break;
			case "4":
				minusMoney();
				break;
			case "5":
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}

	}
	
	
	static void createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String inputBankNum = scanner.nextLine();
		System.out.print("계좌주: ");
		String inputBankOwner = scanner.nextLine();
		System.out.print("초기입금액: ");
		String inputMoney = scanner.nextLine();
		System.out.println("결과 : 계좌가 생성되었습니다. ");

	}

	static void accountList() {
		System.out.println("----------");
		System.out.println("목록");
		System.out.println("----------");
	}

	static void inputMoney() {

	}

	static void minusMoney() {

	}
}
