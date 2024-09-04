package com.wirpro.multi_threads;

public class User implements Runnable{
	
	private BankAccount account;
	private boolean deposit;
	private int amt;
	
	public User(BankAccount account, boolean deposit, int amt) {
		super();
		this.account = account;
		this.deposit = deposit;
		this.amt = amt;
	}	
	
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public boolean isDeposit() {
		return deposit;
	}

	public void setDeposit(boolean deposit) {
		this.deposit = deposit;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public void run() {
		if(deposit)
			account.deposit(amt);
		else
			account.withdraw(amt);
	}
}
