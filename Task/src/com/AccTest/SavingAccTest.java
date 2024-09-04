package com.AccTest;

import com.job1.jobA;
import com.job2.JobB;
import com.savacc.*;

public class SavingAccTest {

	public static void main(String[] args) {

		SavingAccount S = new SavingAccount(1520, "parag", 500);
		jobA ja = new jobA(S);
		JobB jb = new JobB(S);
		
		Thread t1= new Thread(jb);
		ja.start();
		t1.start();
		
		System.out.println("Final Balance: "+S.getbalnce());
		

	}

}
