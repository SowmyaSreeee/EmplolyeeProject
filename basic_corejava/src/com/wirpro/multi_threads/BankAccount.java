package com.wirpro.multi_threads;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amt) {
		if(amt > 0) {
			balance += amt;
			System.out.println(Thread.currentThread().getName() + " deposited " + amt + ". New Balance: " + balance);
		}
	}

	public synchronized void withdraw(int amt) {
		if(amt > 0) {
			if(balance > 0) {
				balance -= amt;
				System.out.println(Thread.currentThread().getName() + " withdraw " + amt + ". New balance: " + balance);
			}
			else {
				System.out.println(Thread.currentThread().getName() + " tried to withraw " + amt + " but insufficient Fumnds");
			}
		}
	}
}
