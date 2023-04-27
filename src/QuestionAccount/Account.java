package QuestionAccount;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
	String inputBankNum;
	String inputBankOwner;
	int inputMoney;
	
	public void inputAccount(String bankNum, String bankOwner, int money) {
		this.inputBankNum = bankNum;
		this.inputBankOwner = bankOwner;
		this.inputMoney = money;
	}
	
}
