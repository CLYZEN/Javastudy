package QuestionAccount;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
	private String accountNum;
	private String name;
	private int money;
	
	public Account() {
		
	}

	public Account(String accountNumber, String name, int money) {
		this.accountNum = accountNumber;
		this.name = name;
		this.money = money;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void howManyInputMoney(int manyMoney) {
		if (manyMoney <= 0) {
			System.out.println("0 이상의 숫자를 입력해주세요.");
			return;
		}
		money += manyMoney;
	}
	
	public void howManyOutMoney(int manyMoney) {
		
		
		if (manyMoney <= 0) {
			System.out.println("0 이상의 숫자를 입력해주세요.");
			return;
		}
		money -= manyMoney;
		System.out.println("출금이 성공되었습니다.");
	}
	
	public void printAccounts() {
		System.out.print(accountNum);
		System.out.print("\t");
		System.out.print(name);
		System.out.print("\t");
		System.out.println(money);
	}
	
}
