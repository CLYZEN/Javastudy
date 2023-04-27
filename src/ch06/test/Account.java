package ch06.test;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > MAX_BALANCE || balance < MIN_BALANCE) {
			return;
		} else {
			this.balance = balance;
		}
	}

}
