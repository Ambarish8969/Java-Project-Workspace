package com;

public class BankImpl implements Bank {
	double balance;
	
	public BankImpl(double balance) {
		this.balance=balance;
	}
	
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs. : "+amount);
		balance=amount+balance;
		System.out.println("Amount Deposited Successfully.");
	}
	
	@Override 
	public void withdraw(int amount) {
		if(amount<=balance) {
			System.out.println("Withdrawing Rs. : "+amount);
			balance=balance-amount;
			System.out.println("Amount Withdrawed Successfully");
		}else {
			try{
				throw new InsufficientBalanceException("Invalid amount");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
}
 