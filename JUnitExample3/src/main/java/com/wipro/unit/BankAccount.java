package com.wipro.unit;

public class BankAccount {

	private int balance;

	public BankAccount() {
		this.balance = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		balance += amount;
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		balance -= amount;

	}

	public void transfer(BankAccount recipent , int amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("transfer amount should be positibve");
		}
		else if (amount > balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		else {
			this.withdraw(amount);
			recipent.deposit(amount);
		}

	}
}
