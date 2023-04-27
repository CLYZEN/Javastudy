package QuestionAccount;

import java.util.Scanner;

public class BankApplication {
	static Account[] accounts = new Account[100];
	static int index = 0;
	
	public static void createAccount() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌번호: ");
		String accountNumber = scanner.nextLine();
		

		System.out.print("계좌주 :");
		String name = scanner.nextLine();
		
		System.out.print("초기입금액 :");
		int money = scanner.nextInt();
		
		Account account = new Account(accountNumber, name, money);
		accounts[index++] = account;
	}
	
	public static void accountListSearch() {
		System.out.println("------------------");
		System.out.println("계좌목록");
		System.out.println("------------------");
		for (int i = 0; i < index; i++) {
			accounts[i].printAccounts();
		}
	}
	
	public static int checkAccountNum(String accountNum) {
		for (int i=0; i<index; i++) {
			if(accounts[i].getAccountNum().equals(accountNum)) {
				return i;
			} 
		} return -999999;
	}
	
	public static void inputMoney() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		int index = checkAccountNum(accountNum);
		
		if (index == -999999) {
			System.out.println("잘못 입력하셨습니다. 존재하는 계좌번호를 입력해주세요.");
		} else {
			accounts[index].howManyInputMoney(money);
		}
	}
	
	public static void outMoney() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		
		System.out.print("출액: ");
		int money = scanner.nextInt();
		
		int index = checkAccountNum(accountNum);
		
		if (index == -999999) {
			System.out.println("잘못 입력하셨습니다. 존재하는 계좌번호를 입력해주세요.");
		} else {
			accounts[index].howManyOutMoney(money);
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		boolean run = true;

		while (run) {
			Scanner scanner = new Scanner(System.in);
			for (int i=0; i<accounts.length; i++) {
				System.out.println(accounts[i]);
			}
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("> ");

			String select = scanner.nextLine();
			switch (select) {
			case "1":
				createAccount();
				break;
			case "2":
				accountListSearch();
				break;
			case "3":
				inputMoney();
				break;
			case "4":
				outMoney();
				break;
			case "5":
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			} // switch

		} // while

	} // main method
} // class
