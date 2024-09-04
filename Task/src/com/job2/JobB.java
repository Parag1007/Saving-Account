package com.job2;

import com.savacc.SavingAccount;

public class JobB implements Runnable {

	private SavingAccount sa;

//	public JobB(SavingAccount sa) {
//
//		this.sa = sa;
//	}

	public JobB(SavingAccount s) {
		this.sa = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			sa.deposit(10);
			
		}

	}

}
