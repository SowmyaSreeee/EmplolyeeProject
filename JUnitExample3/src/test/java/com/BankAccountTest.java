package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.unit.BankAccount;
 
public class BankAccountTest {
 
    private BankAccount account;
    private BankAccount account2;
 
    @BeforeEach
    public void setUp() {
        account = new BankAccount();
        account2 = new BankAccount();
    }
 
    @Test
    public void testInitialBalance() {
        assertEquals(0, account.getBalance(), "Initial balance should be 0");
    }
 
    @Test
    public void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance(), "Balance should be 100 after depositing 100");
    }
 
    @Test
    public void testWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Balance should be 50 after withdrawing 50");
    }
 
    @Test
    public void testTransfer() {
    	account.deposit(100);
    	account.transfer(account2, 50);
    	assertEquals(50, account.getBalance(),"balance of the account should be 50 after transfering 50");
    	assertEquals(50, account2.getBalance(),"balance of the account should be 50 after transfering 50");
    }
}
