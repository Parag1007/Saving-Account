package com.savacc;

public class SavingAccount {

	private int acno;
	private String name;
	private double balance;

	
	

	public SavingAccount(int acno, String name, double Initialbalance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = Initialbalance;
	//	System.out.println();
	}

public 	synchronized double deposit(double amt) {

		balance += amt;
		//System.out.println(balance);

		return balance;

	}

	public synchronized double withdraw(double amt) {

		balance = balance - amt;

		return balance;

	}

	public double getbalnce() {
		return balance;
	}

}
