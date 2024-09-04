package com.job1;

import com.savacc.SavingAccount;

public class jobA extends Thread {

	private SavingAccount sa;

	public jobA(SavingAccount s) {

		sa = s;

	}
	
	public void run() {
		
		for (int i = 0; i <=1000; i++) {
			sa.withdraw(5);
			
		}
	}

}
